package ApplicationControllerPattern;

import java.util.HashMap;

public class ApplicationControllerPattern {

    public static HashMap<String,HandleMath> hashMapOfCommands = new HashMap<String,HandleMath>();

    public void ApplicationControllerPat(){

    }

    public static void handleCommand(String command, Integer num1, Integer num2){

        hashMapOfCommands.put("-", new Subtract());

        HandleMath handler = hashMapOfCommands.get(command);

        handler.execute(num1, num2);

    }

}
