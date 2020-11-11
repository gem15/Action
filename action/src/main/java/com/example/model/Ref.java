/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gennady Mann
 * License Type: Purchased
 */
package com.example.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.*;
@MappedSuperclass
@SuppressWarnings({ "all", "unchecked" })
public class Ref implements Serializable {
	public Ref() {
	}
	
	@Transient	
	private UUID ID;
	
	public UUID getID() {
		return ID;
	}
	
	public UUID getORMID() {
		return getID();
	}

	@Transient	
	private String code;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String aCode) {
		code = aCode;
	}
	
	@Transient	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
