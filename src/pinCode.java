// import javafx.application.Application;
//import javafx.stage.Stage;

public class pinCode {

    public static void main(String[] args) {
        String pin = "111119";
        for (int c=0; c<pin.length(); c++){
            if (pin.charAt(c) < 48 || pin.charAt(c) > 57) System.out.println("!");
        }
        if (pin.length() == 4 || pin.length() == 6) System.out.println("ok");
          else   System.out.printf("!");

    }
}
