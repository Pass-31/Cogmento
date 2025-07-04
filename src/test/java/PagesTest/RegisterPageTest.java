package PagesTest;

import PageLayer.HomePage;
import PageLayer.LoginPage;
import PageLayer.RigsterPage;

public class RegisterPageTest {

	public static void main(String[] args) {
		 LoginPage obj1 = new LoginPage();
		 obj1.loginFunctionalty();

			
		 HomePage obj2 = new HomePage();
		 obj2.homepageFunctionalty();
		 
		 RigsterPage obj3 = new RigsterPage();
		 obj3.registerFunctionalty();

	}

}
