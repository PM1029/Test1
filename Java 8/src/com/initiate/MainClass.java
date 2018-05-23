package com.initiate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cities=Arrays.asList("Mumbai","Chicago","Dallas");
		List<String> citiesN=Arrays.asList("Dallas");
		List<String> citiesB=Arrays.asList("Chicago","Dallas");
		
		Map<Integer,String> map=new HashMap<>();
	List<Person> personList=Arrays.asList(
			new Person("Premal",31,new HashSet<String>(cities)),
			new Person("Navya",2,new HashSet<String>(Arrays.asList("Dallas"))),
			new Person("Bhavika",26,new HashSet<String>(citiesB)));
	
	personList.stream()
.map(person->person.getCities())
.flatMap(c->c.stream())
.forEach(System.out::println);
	
	

	}

}
