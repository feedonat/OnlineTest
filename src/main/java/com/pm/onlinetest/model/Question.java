package com.pm.onlinetest.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Question {

 	@Id
    @GeneratedValue
    private Integer id;
 
    private String description;
    
	@ManyToOne
 	@JoinColumn(name = "subcategory_id") 	   
    private Subcategory subcategory;
	
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)	   
	private Set<Choice> choices;
	
	@ManyToOne
 	@JoinColumn(name = "test_id") 	
	private Test test;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

	public Set<Choice> getChoices() {
		return choices;
	}

	public void setChoices(Set<Choice> choices) {
		this.choices = choices;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	

    
    

}
