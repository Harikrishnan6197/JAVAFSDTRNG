package com.ust.examples;
/*
 * 
 */
import java.util.PriorityQueue;

public class Collection7 {

	public static void main(String args) {
		PriorityQueue<Integer>pQueue = new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		//printing top element of priority queue
		System.out.println(pQueue.peek());
		//printing top element and removing it from the priority queue container
		System.out.println(pQueue.poll());
		//printing the top element again
		System.out.println(pQueue.peek());
		
	}

}
