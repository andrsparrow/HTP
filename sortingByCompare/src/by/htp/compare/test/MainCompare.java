package by.htp.compare.test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MainCompare {

	public static void main(String[] args) {

//		int[] arr = new int[] { 3, 7, 9, 2, 1, 8, 6, 8, 5 };
//		Arrays.sort(arr);
//
//		printArr(arr);
//
//		String[] strs = new String[] { "march", "may", "april", "december", "september" };
//		Arrays.sort(strs);
//		printArr(strs);
		
		
		Person [] pers= new Person[7];
		Person p1= new Person(3,"bob",12);
		Person p2= new Person(13,"ali",14);
		Person p3= new Person(90,"xyp",0);
		Person p4= new Person(23,"barbara",111);
		Person p5= new Person(23,"alice",10);
		Person p6= new Person(18,"zynq",44);
		Person p7= new Person(90,"xyp",990);

		Person p8= new Person(90,"xyp",99);
		Person p9= new Person(2,"alehandro",0);
		
//		pers[0]=p1;
//		pers[1]=p2;
//		pers[2]=p3;
//		pers[3]=p4;
//		pers[4]=p5;
//		pers[5]=p6;
//		pers[6]=p7;
//		
//		Arrays.sort(pers);
//		printPerson(pers);
		
		
		HashSet<Person> pHash= new HashSet<Person>();
		LinkedHashSet<Person> pLinHas= new LinkedHashSet<Person>();
		TreeSet <Person> pTree=new TreeSet<Person>();
		pLinHas.add(p1);
		pLinHas.add(p2);
		pLinHas.add(p3);
		pLinHas.add(p4);
		pLinHas.add(p5);
		pLinHas.add(p6);
		pLinHas.add(p7);
		pLinHas.add(p8);
		pLinHas.add(p9);
		

		pTree.add(p1);
		pTree.add(p2);
		pTree.add(p3);
		pTree.add(p4);
		pTree.add(p5);
		pTree.add(p6);
		pTree.add(p7);
		pTree.add(p8);
		pTree.add(p9);
		

		pHash.add(p1);
		pHash.add(p2);
		pHash.add(p3);
		pHash.add(p4);
		pHash.add(p5);
		pHash.add(p6);
		pHash.add(p7);
		pHash.add(p8);
		pHash.add(p9);
		
		/////////////////////////////////////////////////
		TreeSet <Person> pTree1=new TreeSet<Person>(new PersonComparatorAgeSumm());
		
		TreeSet <Person> pTree2=new TreeSet<Person>(new PersonComparatorNameAgeSumma());
		pTree1.add(p1);
		pTree1.add(p2);
		pTree1.add(p3);
		pTree1.add(p4);
		pTree1.add(p5);
		pTree1.add(p6);
		pTree1.add(p7);
		pTree1.add(p8);
		pTree1.add(p9);
		
		pTree2.add(p1);
		pTree2.add(p2);
		pTree2.add(p3);
		pTree2.add(p4);
		pTree2.add(p5);
		pTree2.add(p6);
		pTree2.add(p7);
		pTree2.add(p8);
		pTree2.add(p9);
		
		
		System.out.println(pTree1);
		System.out.println(pTree2);
		
		
		
		
		
		
		
		
		
		
		
	System.out.println();

	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void printArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void printPerson(Person[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}








class Person implements Comparable<Person>{
	private int age;
	private String name;
	private  int check;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int age) {
		super();
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public Person(int age, String name, int check) {
		super();
		this.age = age;
		this.name = name;
		this.check = check;
	}



//	@Override
//	public int compareTo(Object o) {
//		return this.age-((Person)o).getAge();
//		
//	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", check=" + check + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.getAge()-o.getAge();
	}
	
}



class PersonComparatorAgeSumm implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		if(o1.getAge()>o2.getAge()){
			return 1;
		}
		else{
			if(o1.getAge()<o2.getAge()){
				return -1;
			}
			else{
				if(o1.getCheck()>o2.getCheck()){
					return 1;
				}else{
					if(o1.getCheck()<o2.getCheck()){
						return -1;
					}else{
						return 0;
					}
				}
			}
		}
	}
	
}


class PersonComparatorNameAgeSumma implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		if(o1.getName().charAt(0)>o2.getName().charAt(0)){
			return 1;
		}else{
			if(o1.getName().charAt(0)<o2.getName().charAt(0)){
				return -1;
			}else{
				
				if(o1.getAge()>o2.getAge()){
					return 1;
				}
				else{
					if(o1.getAge()<o2.getAge()){
						return -1;
					}
					else{
						if(o1.getCheck()>o2.getCheck()){
							return -1;
						}else{
							if(o1.getCheck()<o2.getCheck()){
								return 1;
							}else{
								return 0;
							}
						}
					}
				}
			}
		}
	}
}








