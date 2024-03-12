package org.lconnectverse.services;

import lombok.RequiredArgsConstructor;
import org.lconnectverse.entity.User;
import org.lconnectverse.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUsers(User user){
        userRepository.save(user);
    }

    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
    public void refactorUser(String name,String password,User user,String email){
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);
        userRepository.save(user);
    }
}
