package com.initiate;

import java.util.HashSet;
import java.util.Set;

public class Person {

String name;
int age;
Set<String> cities;

public Set<String> getCities() {
	return cities;
}
public void setCities(Set<String> cities) {
	this.cities=new HashSet<>();
	this.cities = cities;
}
Person(String name,int age,Set<String> cities)
{
	this.name=name;
	this.age=age;
	this.cities=cities;
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
