package com.piyuri.java;
/**
 * @author piyuri
 *
 */

public class BountStack implements Stack {

	public static  class IlligalStateExcetion extends RuntimeException {

	}

	private int capacity;
	private int size;
	private int[] element;	
	public static Stack Make(int i) {
		// TODO Auto-generated method stub


	




		if(i<0)
		{
			throw new IlligalStateExcetion();
		}
		return new BountStack(i);}


	private BountStack(int i) {
		// TODO Auto-generated constructor stub


		this.capacity=i;
		element=new int[capacity];
	}


	/* (non-Javadoc)
	 * @see com.piyuri.java.BoundStack1#isEmpty()
	 */
	@Override
	public boolean isEmpty()
	{
		return size==0;
	}


	/* (non-Javadoc)
	 * @see com.piyuri.java.BoundStack1#setSize(int)
	 */



	/* (non-Javadoc)
	 * @see com.piyuri.java.BoundStack1#getSize()
	 */
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	/* (non-Javadoc)
	 * @see com.piyuri.java.BoundStack1#push(int)
	 */
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub



		if(size==capacity)
		{
			throw new StackOverflow();
		}

		this.element[size++]=i;





	}


	/* (non-Javadoc)
	 * @see com.piyuri.java.BoundStack1#pop()
	 */
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(size==0)
		{
			throw new UnderFlow();
		}


		return element[--size];






	}
	public class StackOverflow extends RuntimeException{



	}

	public  class UnderFlow extends RuntimeException{

	}
}
