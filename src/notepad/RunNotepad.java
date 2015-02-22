package notepad;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dan on 2/8/2015.
 */
public class RunNotepad {

    public static ArrayList<User> usersList = new ArrayList<User>();
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int option = 0;


        do {
            System.out.println("1.Add user");
            System.out.println("2.List users");
            System.out.println("3.Login");
            System.out.println("4.Exit");

            option = in.nextInt();
            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    printUsersList();
                    break;
                case 3:
                   login();
                    break;
                case 4:
                    System.out.println("Bye!");
                    break;
            }

        } while (option != 4);
    }

    private static void addUser() {
        System.out.println("UserName: ");
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        System.out.println("Password: ");
        String password = in.nextLine();
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        usersList.add(user);

    }


    private static void printUsersList() {
        System.out.println(usersList);

    }

    private static void login(){
        boolean conditie = false;
        do {
            System.out.println("Username: ");
            String userNameIntrodus = in.next();
            System.out.println("Password: ");
            String passwordIntrodus = in.next();



            for(int i = 0; i < usersList.size(); i++){
                if(userNameIntrodus.equalsIgnoreCase(usersList.get(i).getUserName()) && passwordIntrodus.equals(usersList.get(i).getPassword())){
                    Runtime np = Runtime.getRuntime();
                    try {
                        np.exec("notepad");
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    conditie = true;
                }
            }


        } while (!conditie);
    }


}


