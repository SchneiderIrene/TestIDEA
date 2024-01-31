package ait_user_project.controllers;

import ait_user_project.model.User;
import ait_user_project.services.UserService;

import java.util.List;
import java.util.Scanner;

public class UserControllerConsoleImpl implements UserController{

    Scanner scanner = new Scanner(System.in);
    private UserService service;

    public UserControllerConsoleImpl(UserService service) {
        this.service = service;
    }

    @Override
    public void create() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        try {
            service.createUser(name,email);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public User getByID() {
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        User user = new User(null, null);
        try {
          user =  service.getByID(Long.parseLong(id));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        return user;
    }

    @Override
    public User getByEmail() {
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        return service.getByEmail(email);
    }

    @Override
    public List<User> getAll() {
        return service.getAllUsers();
    }

    @Override
    public void printAll() {
        List<User>allUsers = service.getAllUsers();
        if(allUsers.isEmpty()){
            System.out.println("There are still no users or the is not available");
        }
        else {
            allUsers.forEach(System.out::println);
        }
    }
    @Override
    public void delete() {
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();

        service.deleteById(Long.parseLong(id));
    }
    @Override
    public void update() {
        System.out.println("Enter ID of the user you want to update: ");
        String id = scanner.nextLine();
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new email: ");
        String email = scanner.nextLine();

        User tempUser = new User(Long.parseLong(id),name, email);

        try {
            service.updateUser(tempUser);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
