
/**
*
*
*
**/

import java.util.*;
public class LinkedList<T>{
	//head,tail,size,element implementation

	private class Node<T>{
		private Node<T> next;
		private T element;

		protected Node(T elem, Node<T> n){
			element = elem;
			next = n;
		}

		protected Node<T> getNext(){
			return next;
		}

		protected void setNext(Node<T> n){
			next = n;
		}

		/**
		* Returns the current nodes element
		**/
		protected T getElement(){
			return element;
		}
	}

	private Node<T> head=null;
	private Node<T> tail=null;
	private int size=0;

	public LinkedList(){
		//do nothing
	}

	public int getSize(){
		return size;
	}

	public void increment(){
		size++;
	}

	public void decrement(){
		if(size>0)
			size--;
		else
			return;
	}

	public boolean isEmpty(){
		return (size==0);
	}

	public void pushFront(T elem){
		if(size==0){
			head = new Node<>(elem,null);
			tail = head;
		}else{
			Node<T> temp = head;
			head = new Node<>(elem,temp);
		}
		increment();
	}

	public void pushBack(T elem){
		if(size==0){
			pushFront(elem);
		}else{
			Node<T> temp = tail;
			tail = new Node<>(elem,null);
			temp.setNext(tail);
		}
		increment();
	}

	public void pushIndex(T elem, int i){
		if(size!=0 && size>i && i>=0){
			Node<T> temp = head;
			Node<T> temp2;
			for(int x=0;x<i-1;x++){
				temp = temp.getNext();
			}
			temp2 = temp.getNext();
			temp.setNext(new Node<>(elem,temp2));
			increment();
		}else{
			//out of bounds
			throw new IndexOutOfBoundsException();
		}
	}

	public T popFront(){
		if(size>0){
			Node<T> temp = head;
			head = head.getNext();
			decrement();
			T test = (T)temp.getElement();
			return test;
		}else{
			return null;
		}
	}

	public T popBack(){
		if(size>0){
			Node<T> temp = head;
			Node<T> temp2 = tail;
			for(int x=0;x<size-1;x++){
				temp = temp.getNext();
			}
				tail = temp;
				decrement();
				T test = (T)temp2.getElement();
				return test;
		}else{
			return null;
		}
	}

	public void printElements(){
		Node<T> temp = head;
		for(int x=0;x<size;x++){
			System.out.print(temp.getElement() + " ");
			temp.getNext();
		}
		System.out.println("");
	}


}