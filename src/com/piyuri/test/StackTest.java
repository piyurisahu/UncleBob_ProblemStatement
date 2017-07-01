package com.piyuri.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.piyuri.java.BountStack;
import com.piyuri.java.Stack;
import com.piyuri.java.BountStack;

import junit.framework.Assert;
/**
 * @author piyuri
 *
 */
public class StackTest {

	Stack stack;
	@Before
	public void setUp() throws Exception {
		 stack=BountStack.Make(2);
	
	}
	@Test
	public void createStack() throws Exception 
	{
		
		assertEquals(0, stack.getSize());
		assertTrue(stack.isEmpty());
		
		
	}
	
	@Test
	public void afterOnePush() throws Exception 
	{
		
		stack.push(1);
		assertEquals(1,stack.getSize()); 
		assertFalse(stack.isEmpty() );
	}

	
	
	@Test
	public void afterOnePush_OnePop_StackShouldBeEmpty() throws Exception 
	{
		
		stack.push(1);
		stack.pop();
		/*assertEquals(0,stack.getSize()); */
		assertTrue(stack.isEmpty() );
	}
	@Test(expected=BountStack.StackOverflow.class)
	public void whenPushedPastLimit_StackOverflows() throws Exception
	{
		stack.push(1);
		stack.push(1);
		stack.push(1);
	}
	
	@Test(expected=BountStack.UnderFlow.class)
	public void whenEmptyStackIspoped_ShouldbeUnderFlow() throws Exception
	{
		
		stack.pop();
	}
	
	
	@Test
	public void onePushOnePop() throws Exception
	{
		stack.push(1);
		assertEquals(1,stack.pop());
		
		
	}
	
	@Test
	public void whenOneTwoIsPushed_TwoOneShouldBePopped() throws Exception
	{
		stack.push(1);
		stack.push(2);
		assertEquals(2,stack.pop());
		assertEquals(1,stack.pop());
		
	
	}
	
	@Test(expected=BountStack.IlligalStateExcetion.class)
	public void whenNegativeCapicityIscreated_ShouldThrowIlligalStateExpetion() throws Exception
	{
		stack=BountStack.Make(-1);
		}
	
}




