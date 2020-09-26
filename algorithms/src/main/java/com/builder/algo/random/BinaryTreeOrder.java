package com.builder.algo.random;

import com.builder.algo.random.BTree.Node;

/*
 *         40
 *        /  \
 *      20    50   
 *     /  \     \
 *   10   30     60
 *  /    /  \
 * 5    67   78
 */

public class BinaryTreeOrder {

	public static void main(String[] args) {
		Node node = new Node("40");
		Node node1 = new Node("20");
		Node node2 = new Node("50");
		Node node3 = new Node("10");
		Node node4 = new Node("30");
		Node node5 = new Node("60");
		Node node6 = new Node("5");
		Node node7 = new Node("67");
		Node node8 = new Node("78");

		BTree bTree = new BTree(node);
		node.setLeft(node1);
		node.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node3.setLeft(node6);
		node4.setLeft(node7);
		node4.setRight(node8);
		node2.setRight(node5);

		bTree.inOrder();
		bTree.preOrder();
		bTree.postOrder();

	}
}

class BTree {

	private Node root;

	public BTree(Node node) {
		root = node;
	}

	static class Node {

		private String data;
		private Node left;
		private Node right;

		public Node(String data) {
			this.data = data;
			left = null;
			right = null;
		}

		public void setLeft(Node node) {
			left = node;
		}

		public void setRight(Node node) {
			right = node;
		}

	}

	public void inOrder() {
		System.out.print("InOrder --> ");
		inOrder(root);
		System.out.println("");
	}

	public void preOrder() {
		System.out.print("preOrder --> ");
		preOrder(root);
		System.out.println("");
	}

	public void postOrder() {
		System.out.print("postOrder --> ");
		postOrder(root);
	}

	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
		}
	}

	private void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	private void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
}
