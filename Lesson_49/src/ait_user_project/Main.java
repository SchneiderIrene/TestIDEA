package ait_user_project;

import ait_user_project.controllers.UserController;
import ait_user_project.controllers.UserControllerConsoleImpl;
import ait_user_project.repositories.UserRepository;
import ait_user_project.repositories.UserRepositoryListImpl;
import ait_user_project.services.UserService;
import ait_user_project.services.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepositoryListImpl();
        UserService service = new UserServiceImpl(repository);
        UserController controller = new UserControllerConsoleImpl(service);

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit){
            System.out.println("Enter: ");
            System.out.println("1: Create User");
            System.out.println("2: Print all users");
            System.out.println("3: User by ID");
            System.out.println("4: User by email");
            System.out.println("5: Delete user");
            System.out.println("6: Update user");
            System.out.println("exit");

            String command = scanner.nextLine().toLowerCase();
            switch (command){
                case "exit" : exit = true; break;
                case "1" : controller.create(); break;
                case "2" : controller.printAll(); break;
                case "3" :
                    System.out.println(controller.getByID());break;
                case "4" :
                    System.out.println(controller.getByEmail());break;
                case "5" : controller.delete(); break;
                case "6" : controller.update(); break;
            }
        }


    }
}
