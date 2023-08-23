package com.example.demo.service;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

import com.example.demo.repository.UserRepo;





@Service

public class UserService {

@Autowired

UserRepo ur;



//USERS



//POST

public List<User> savedetails(List<User> u)

{

     return (List<User>)ur.saveAll(u);

}



//GET

public List<User> showinfo(){

     return ur.findAll();

}



//GET BY ID

public Optional<User> showbyid(int id)

{

      return ur.findById(id);

}



//PUT

public User changeinfo(User u)

{

     return ur.saveAndFlush(u);

}



//PUT BY ID

public String updateinfobyid(int id,User u)

{

     ur.saveAndFlush(u);

if(ur.existsById(id))

{

    return "Updated";

}

else

{

    return "Enter valid id";

}

}



//DELETE

public void deleteinfo(User u)

{

    ur.delete(u);

}

//DELETE BY ID(PathVariable)

public void deleteid(int id)

{

    ur.deleteById(id);

}



}

