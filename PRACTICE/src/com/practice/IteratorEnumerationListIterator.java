package com.practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;
import java.util.stream.Stream;

public class IteratorEnumerationListIterator {
	
	
	public static void main(String[] args) {
		Vector<Integer> list=new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		System.out.println("Splitrator");   //except Map we can iterate all collection api and Stream
		
		Stream<Integer> abc=list.stream();
		
		Spliterator<Integer> sptr=abc.spliterator();
		System.out.println("From Spliteratior");
		sptr.forEachRemaining(n->System.out.println(n));
		
		
		
		System.out.println("Iterator");
		Iterator<Integer> c=list.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		
		System.out.println("Enumeration");
		Enumeration<Integer> ejk=list.elements();
		while(ejk.hasMoreElements())
		{
			System.out.println(ejk.nextElement());
		}
		
		System.out.println("ListIterator: ");
        
        ListIterator<Integer> ltr = list.listIterator();
        while (ltr.hasNext()) {
            int i = (Integer)ltr.next();
            if (i == 20)
                ltr.remove();
              
            else if (i == 30)
                ltr.add(60);
              
            else if (i == 40)
                ltr.set(100);
        }
          
        System.out.println(list);
	}

}
