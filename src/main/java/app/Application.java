package app;

import app.user.UserController;
import app.user.UserService;

public class Application {

	
    public static void main(String[] args) {
 
    	new UserController(new UserService());
 
    }

}
