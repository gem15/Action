package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Action")
@SuppressWarnings({ "all", "unchecked" })
public class Action extends Ref implements Serializable{
	public Action() {
	}
	
	public String toString() {
		return super.toString();
	}
    
}
