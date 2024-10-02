package com.mateuslll.microuser.service;

import com.mateuslll.microuser.database.model.UserEntity;
import com.mateuslll.microuser.database.repository.UserRepository;
import com.mateuslll.microuser.producer.UserProducer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

   private final UserRepository userRepository;
   private final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }

    @Transactional
    public UserEntity save(UserEntity userEntity){
        userEntity = userRepository.save(userEntity);
        userProducer.publishMessageEmail(userEntity);
        System.out.println("User saved: " + userEntity.getUserID());
        return userEntity;
    }

}