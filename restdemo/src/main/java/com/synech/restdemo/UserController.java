package com.synech.restdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/users")
public class UserController {


	
	@GetMapping(value="/all",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers(){
		List<User> listOfUsers=new ArrayList<>();
		listOfUsers.add(new User(1l,"Amit"));
		listOfUsers.add(new User(2l,"Amit"));
		return listOfUsers;
	}
	
	@GetMapping(value="/xs",produces=MediaType.APPLICATION_XML_VALUE)
	public UserList getUsersXml(){
		List<User> listOfUsers=new ArrayList<>();
		listOfUsers.add(new User(1l,"Amit"));
		listOfUsers.add(new User(2l,"Amit"));
		//Optional<User> u=listOfUsers.stream().filter((ur)->ur.getId()==1l).findAny();
		return new UserList(listOfUsers);
	}
	
	
	@GetMapping(value="/user/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@PathVariable(name="id")long id){
		List<User> listOfUsers=new ArrayList<>();
		listOfUsers.add(new User(1l,"Amit"));
		listOfUsers.add(new User(2l,"Amit"));
		System.out.println(id);
		Optional<User> u=listOfUsers.stream().filter((ur)->ur.getId()==id).findAny();
		return u.get();
	}
	
	@PostMapping(value="/add",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.TEXT_PLAIN_VALUE)
	public String addUser(@RequestBody User user){
		return "Successfully Added";
	}
	
}
