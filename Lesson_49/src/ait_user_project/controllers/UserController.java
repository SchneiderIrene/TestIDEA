package ait_user_project.controllers;

import ait_user_project.model.User;

import java.util.List;

public interface UserController {

  void create();

User getByID();
User getByEmail();

 List<User> getAll();
 void printAll();
 void delete();
 void update();
}
