package com.example.java;


import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

//classes to implement
class SumInLeavesVisitor extends TreeVis {
    private int sumOfValuesOfLeaves = 0;

    public int getResult() {
        //implement this
        return sumOfValuesOfLeaves;
    }

    public void visitNode(TreeNode node) {
        //implement this

    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        sumOfValuesOfLeaves+=leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private int productOfRedNodes = 1;
    public int getResult() {
        //implement this
        return productOfRedNodes;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getColor()==Color.RED){
            productOfRedNodes=productOfRedNodes*node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor()==Color.RED){
            productOfRedNodes=productOfRedNodes*leaf.getValue();
        }
    }
}

class FancyVisitor extends TreeVis {
    private int sumOfValuesOfNodeWithEvenDepth = 0;
    private int sumOfValuesOfGreenLeaf = 0;
    public int getResult() {
        //implement this
        return Math.abs(sumOfValuesOfNodeWithEvenDepth-sumOfValuesOfGreenLeaf);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getDepth()%2==0){
            sumOfValuesOfNodeWithEvenDepth+=node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor()==Color.GREEN){
            sumOfValuesOfGreenLeaf+=leaf.getValue();
        }
    }
}

public class Main {

    //static method to implement
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n+1];
        int[] colors = new int[n+1];
        int[] u = new int[n-1];
        int[] v = new int[n-1];
        //values[1] is not used
        for(int i=1; i<n+1; i++){
            values[i] = sc.nextInt();
        }
        //colors[1] is not used
        for(int i=1; i<n+1; i++){
            colors[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){//these arrays contain numbers of trees (from 1 to n)
            u[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        sc.close();
        Tree root;
        if(colors[1]==0 && n==1) {//root initilization
            root = new TreeLeaf(values[1], Color.RED, 0);
        } else if(colors[1]==0 && n>1) {
            root = new TreeNode(values[1], Color.RED, 0);
        }
        else if(colors[1]==1 && n==1){
            root = new TreeLeaf(values[1], Color.GREEN, 0);
        } else {
            root = new TreeNode(values[1], Color.GREEN, 0);
        }
        if(n>1){//searching for numbers of children and adding children
            TreeNode parentTree = (TreeNode) root;
            Tree child;
            int deep = 1;
            boolean[] initializedNumbers = new boolean[n+1];
            initializedNumbers[1] = true;
            //initializedNumbers[0] is not used
            Tree[] trees = new Tree[n+1];//array to save links
            //trees[0] is not used
            trees[1] = root;
            for(int i=1; i<=n; i++){
                if(trees[i] instanceof TreeNode){//Only TreeNode has children
                    parentTree = (TreeNode) trees[i];
                } else{//TreeLeaf doesn't have children
                    continue;
                }
                for(int j=0; j<n-1; j++){//searching for numbers of children of ith tree
                    if(u[j]==i){
                        //add v[i] child
                        int number = v[j];
                        boolean isSomeoneParent = false;
                        for(int k=0; k<n-1; k++){//checking, if numberth tree is someone's parent
                            if(u[k]==number){
                                isSomeoneParent = true;
                                break;
                            }
                        }
                        if(!initializedNumbers[number]){
                            initializedNumbers[number] = true;
                            if(isSomeoneParent){
                                if(colors[number]==0){
                                    child = new TreeNode(values[number], Color.RED, i);
                                }else{
                                    child = new TreeNode(values[number], Color.GREEN, i);
                                }
                            } else{
                                if(colors[number]==0){
                                    child = new TreeLeaf(values[number], Color.RED, i);
                                }else{
                                    child = new TreeLeaf(values[number], Color.GREEN, i);
                                }
                            }
                            trees[number] = child;
                        } else{
                            child = trees[number];
                        }
                        parentTree.addChild(child);
                    }
                }
            /*TreeNode parentTree = (TreeNode) root;
            Tree child;
            for(int i=1; i<n; i++){
                if(i%2==1 || i==n-1) {//children of last generation
                    if(colors[i]==0){
                        child = new TreeLeaf(values[i], Color.RED, (i+1)/2);
                    }else{
                        child = new TreeLeaf(values[i], Color.GREEN, (i+1)/2);
                    }
                } else {//children of non-last generation
                    if(colors[i]==0){
                        child = new TreeNode(values[i], Color.RED, (i+1)/2);
                    } else{
                        child = new TreeNode(values[i], Color.GREEN, (i+1)/2);
                    }
                }
                parentTree.addChild(child);
                if(i%2==0 && i!=n-1){//next generetions are childs of "child"
                    parentTree = (TreeNode) child;
                }
            }*/
            }
        }
        return root;
    }


    public static void main(String[] args) {
	// write your code here
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
