package fode.com;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
    private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
