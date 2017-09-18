package com.htp.test2;

public class Test {

	public static void main(String[] args) {
		
		int [] aaa= {1,2,3,4,5,6,7,8,9};
		
		
		ArrList al=new ArrList(aaa);
		System.out.println(al);
//		
//		al.add(3);
//		System.out.println(al);
//		
//		al.add(aaa);
//		System.out.println(al);
//		
//		al.add(2,666);
//		System.out.println(al);
//		
//		
//		
//		al.remove(1);
//		System.out.println(al);
//		
//		
//		
//		
//		al.add(aaa);
//		System.out.println(al);
//		
//		
//		al.add(1,666);
//		System.out.println(al);
//		
//		ArrList al1=new ArrList("aaa");
//		//System.out.println(al1);
//		al1.add("bbb");
//		//System.out.println(al1);

		
		
		LinList ll=new LinList();
		System.out.println(ll);
		ll.add(111);
		ll.add(222);
		ll.add(333);
		ll.add(444);
		ll.add(555);
	
		System.out.println(ll);
		
		
	
		ll.add(666);
		System.out.println(ll);
		
		ll.add(123,1);
		System.out.println(ll);
		
		ll.addFirst(69);
		System.out.println(ll);
		
		ll.add(888,0);
		System.out.println(ll);
		
		
		ll.remove(1);
		System.out.println(ll);
		
		
		
	}

}
