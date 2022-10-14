package day19;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparable트리셋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("a", 10));
		treeSet.add(new Person("b", 11));
		treeSet.add(new Person("c", 12));
		treeSet.add(new Person("d", 13));
		treeSet.add(new Person("e", 11));
		
		Iterator<Person> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Person implements Comparable<Person>{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age;
	}

	@Override
	public int compareTo(Person o) {
		if(age < o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
}
