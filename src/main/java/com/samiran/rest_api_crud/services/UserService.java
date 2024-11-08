package com.samiran.rest_api_crud.services;

import com.samiran.rest_api_crud.entities.User;
import com.samiran.rest_api_crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        return  userRepository.findAll();
    }

    public User createUser(User user){
        return  userRepository.save(user);
    }

    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public  User updateUser(int id, User userDetails){
        User user = getUserById(id);
        if (user != null){
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return  userRepository.save(user);
        }

        return  null;
    }


    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

}
