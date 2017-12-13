package singleton;

public class Main {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject singleObject = SingleObject.getInstance();

	      //show the message
	      singleObject.showMessage();
	      
	      //Get the only object available
	      singleObject = SingleObject.getInstance();

	      //show the message
	      singleObject.showMessage();

	   }
	}