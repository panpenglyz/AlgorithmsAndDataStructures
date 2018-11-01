package com.structure.array.binary_search_tree;

/**
 * 二分搜索树
 *
 * @author pp-sir
 * @date 2018/11/1 10:15
 */
public class BST<E extends Comparable<E>> {

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二分搜索树中添加新的元素e
     *
     * @param e
     */
    public void add(E e) {
        root = add(root, e);
    }

    private Node add(Node node, E e) {

        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            node = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node = add(node.right, e);
        }

        return node;

    }

    /**
     * 节点对象
     */
    private class Node {
        /**
         * 节点存储数据
         */
        public E e;
        /**
         * 左节点、右节点
         */
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }
}
