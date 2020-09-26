package com.builder.algo.random;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	private Queue<String> q1 = new LinkedList<String>();
	private Queue<String> q2 = new LinkedList<String>();

	public void push(String value) {
		q2.add(value);

		while (!q1.isEmpty()) {
			q2.add(q1.remove());
		}

		Queue<String> temp = q1;
		q1 = q2;
		q2 = temp;
		System.out.println("afer push q1 --> " + q1);
	}

	public void pop() {
		q1.poll();
		System.out.println("afer poll q1 --> " + q1);
	}

	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push("1");
		s.push("2");
		s.push("3");
		s.pop();
		s.pop();
		s.push("4");
		s.pop();
	}

}
