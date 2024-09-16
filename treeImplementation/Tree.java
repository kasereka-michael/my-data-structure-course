package treeImplementation;


import treeimplementation.BinaryTree;

public class Tree {


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(6);
        tree.insert(19);
        tree.insert(4);
        tree.postOrder();
    }
}


