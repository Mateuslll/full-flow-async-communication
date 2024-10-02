package com.mateuslll.microuser.controller;

import com.mateuslll.microuser.database.model.UserEntity;
import com.mateuslll.microuser.dto.UserDTO;
import com.mateuslll.microuser.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserDTO userDTO) {
        var userEntity = new UserEntity();
        BeanUtils.copyProperties(userDTO, userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(userEntity));
    }


}
