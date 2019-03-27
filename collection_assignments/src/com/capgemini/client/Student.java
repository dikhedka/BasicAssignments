package com.capgemini.client;

public  class Student implements Comparable<Student> {
	 
	 private int id;
	 private String names;
	 
	
	 
	 public Student(int id, String names) {
		super();
		this.id = id;
		this.names = names;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNames() {
		return names;
	}


	public void setNames(String names) {
		this.names = names;
	}


	


	@Override
	public String toString() {
		return "Student [id=" + id + ", names=" + names + ", fruitsName=" +  "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + id;
		result = prime * result + ((names == null) ? 0 : names.hashCode());
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
		Student other = (Student) obj;
		
		if (id != other.id)
			return false;
		if (names == null) {
			if (other.names != null)
				return false;
		} else if (!names.equals(other.names))
			return false;
		return true;
	}
	 
	
	@Override
	public int compareTo(Student s) {
		
		return Integer.compare(this.id, s.id);
	}
	
		
    
	
	 
	 
       
}
