package org.acme.hibernate.orm.panache;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Fruit extends PanacheEntity{

	public String name;

	public Fruit() {
	}

	public Fruit(String name) {
		this.name = name;
	}
}
