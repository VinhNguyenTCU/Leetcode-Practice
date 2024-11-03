/*
 * Date Created: 11/03/2024
 */

import java.util.*;
/*
     * This code implements a Binary Tree with functions to insert and search along with default Java methods
     */

public class BinaryTree <E extends Comparable <? super E>> implements Iterable <E>{
    private TreeNode<E> root;
    private int size;

    public BinaryTree(){
        root = null; // no data
        size = 0;
    }

    public Iterator <E> iterator(){
        return new TreeItr();
    }

    /*--------------------------------------*/
    private class TreeItr implements Iterator<E>{
        private ArrayDeque <TreeNode <E>> stack = new ArrayDeque<>();
        private TreeNode <E> current = root;

        public boolean hasNext(){
            return (!stack.isEmpty() || current != null);
        }

        public E next(){
            E item = null;
            while (!stack.isEmpty() || current != null){
                if (current != null){
                    stack.push(current);
                    current = current.leftChild;
                }else{
                    current = stack.pop();
                    item = current.data;
                    current = current.rightChild;
                    break;
                }
            }
            return item;
        }
    }

     /* This function returns the size of the trees */
     public int size(){
        return this.size;
    }

    /* This function returns true if the tree is empty */
    public boolean isEmpty(){
        return this.root == null;
    }

    /*This function takes in the target value and inserts it into a new node that makes the treee more complete. It will try to add to the left most on the highest level. It uses a breadth first approach. */
    public void insert(E item){
        TreeNode <E> newNode = new TreeNode<BinaryTree.E>(item);
        if (isEmpty()){
            root = newNode;
        }else{
            /*Creates a queue and adds the children into the queue, removing and checking them to see if there is an open space for the new node.
             * It will add the node to the spot and fix the pointers
             */

            ArrayDeque<TreeNode<E>> queue = new ArrayDeque<>();
            queue.add(root);
            while(!queue.isEmpty()){
                TreeNode<E> currentNode = queue.removeFirst();
                if (currentNode.leftChild == null){  // check left child
                    newNode.parent = currentNode;
                    currentNode.rightChild = newNode;
                    break;
                }else if (currentNode.rightChild == null){ // check right child
                    newNode.parent = currentNode;
                    currentNode.leftChild = newNode;
                    break;
                }else{
                    queue.add(currentNode.leftChild);
                    queue.add(currentNode.rightChild);
                }
            }
        }
        size++;
    }

    /*This function takes in an item and returns true if the item is in the tree. It uses a breadth first seach and will search left to right, top to bottom */
    public boolean breadthFirstSearch(E item){
        if(isEmpty()){
            return false;
        }

        /*Adds each child to the queue left and right until there are no more to add, and goes through each item to see if it equals the target */
        ArrayDeque <TreeNode<E>> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode <E> currentNode = queue.removeFirst();
            if (currentNode.data.equals(item)){
                return true;
            }
            if (currentNode.leftChild != null){
                queue.add(currentNode.leftChild);
            }
            if (currentNode.rightChild != null){
                queue.add(currentNode.rightChild);
            }
        }
        return false; // has gone through the whole tree and the target is not in the queue
    }

    /*This function takes in a target item and an integer that describes the order (1 = preorder, 2=inorder, 3=postorder)
     * It will use a depth first search using the specified type and return true if the target item is in the tree
    */





















    /* TreeNode class, has parent, left and right children and data along with two constructors that take in data & parent or just data */
    private class TreeNode <E> {
        private TreeNode <E> parent;
        private TreeNode <E> leftChild;
        private TreeNode <E> rightChild;
        private E data;

        public TreeNode (E data, TreeNode<E> parentNode){
            this.parent = parentNode;
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }

        public TreeNode (E d){
            this.data = d;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

}
