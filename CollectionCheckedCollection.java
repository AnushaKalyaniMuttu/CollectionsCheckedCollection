package com.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
//Collection<E> checkedCollection(Collection<E> c, Class<E> type)
/*
 * Keep in mind that while Collections.checkedCollection() provides some level of runtime type checking,
 *  it doesn't provide full compile-time type checking. It's still recommended to use generics and 
 * proper type declarations whenever possible to catch type errors at compile time.
 */
		
	
		        List rawList = new ArrayList();
		        Collection checkedList = Collections.checkedCollection(rawList, String.class);

		        // This will work fine, since the checkedList enforces type safety
		        checkedList.add("apple");
		        checkedList.add("banana");

		        // This will result in a ClassCastException at runtime
		         checkedList.add(42); 

		        System.out.println("Checked List: " + checkedList);
		    }
		
	}
