package ait_user_project.repositories;

import ait_user_project.model.User;

public interface UserRepository extends CrudRepository<User>{
  User findByEmail(String email);
}
