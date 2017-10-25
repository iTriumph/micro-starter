package com.believe.query.users.web;

import com.believe.query.users.domain.Users;
import com.believe.query.users.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
//@RestController
//@RequestMapping("/users")
public class UsersQueryController {

//  @Autowired
  private UsersRepository usersRepository;

  @GetMapping("/")
  public List<Users> list() {
    return usersRepository.findAll();
  }

}

