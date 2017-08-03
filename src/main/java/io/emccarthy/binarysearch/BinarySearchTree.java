package io.emccarthy.binarysearch;

public class BinarySearchTree<E extends Comparable<E>>{

    private final class Node {

        E value;
        Node left;
        Node right;

        Node(E value) {
            this.value = value;
        }

    }

    Node rootNode;

    public BinarySearchTree() {}

    public void add(E value) {
        if(rootNode == null) {
            rootNode = new Node(value);
        } else {
            Node currentNode = rootNode;
            while(true) {
                if(value.compareTo(currentNode.value) < 0){
                    if(currentNode.left == null) {
                        currentNode.left = new Node(value);
                        return;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else if(value.compareTo(currentNode.value) > 0) {
                    if(currentNode.right == null) {
                        currentNode.right = new Node(value);
                        return;
                    } else {
                        currentNode = currentNode.right;
                    }
                } else {
                    //We must be equal to the value already present, no need to re-add
                    return;
                }
            }
        }
    }

    public boolean contains(E value) {
        Node current = this.rootNode;
        while (current != null) {
            if(current.value.compareTo(value) == 0) {
                return true;
            }
            if(current.value.compareTo(value) > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void remove(E item) {
        Node current = this.rootNode;
        Node parent = this.rootNode;
        boolean leftChild = false;
        while(current.value.compareTo(item) != 0){
            parent = current;
            if(current.value.compareTo(item) < 0) {
                current = current.right;
                leftChild = false;
            }else {
                current = current.left;
                leftChild = true;
            }
        }

        if(isLeaf(current)){
            if(leftChild){
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if(hasOneChild(current)){
            if(current == rootNode){
                rootNode = current.left == null ? current.right : current.left;
            }
        } else {
            Node successor = findSuccessor(current);
            if(current == this.rootNode) {
                this.rootNode = successor;
            }else if(leftChild){
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

    private Node findSuccessor(Node root) {
        Node current = root.right;
        Node successorParent = null;
        Node successor = null;
        while(current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if(successor.value.compareTo(root.right.value) != 0) {
            successorParent.left = successor.right;
            successor.right = root.right;
        }
        return successor;
    }

    private boolean hasOneChild(Node current) {
        return (current.right != null && current.left == null) || (current.left != null && current.right == null);
    }

    private boolean isLeaf(Node current) {
        return current.left == null && current.right == null;
    }


}
