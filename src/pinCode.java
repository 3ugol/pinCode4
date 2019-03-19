// import javafx.application.Application;
//import javafx.stage.Stage;

public class pinCode { //pin digit 4 of 6 chars

    public static void main(String[] args) {
        String pin = "e11119";
        for (int c=0; c<pin.length(); c++){
            if (!Character.isDigit(pin.charAt(c))) System.out.println("!");
        }
        if (pin.length() == 4 || pin.length() == 6) System.out.println("ok");
          else   System.out.printf("!");

    }
}
