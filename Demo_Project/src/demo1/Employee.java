package demo1;

import java.io.Serializable;

public final class Employee {
	
	private Integer id;
	private String name;
	
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
