package webApp.entity;

import javax.persistence.*;

@Entity
@Table
public class TestHibernate {
	@Column(name = "id")
	Integer id;
	@Column(name = "name")
	String name;
	@Column(name = "pass")
	String password;

	public TestHibernate() {
		
	}

	public TestHibernate(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public TestHibernate(Integer id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
