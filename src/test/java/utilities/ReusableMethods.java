package utilities;

import org.openqa.selenium.By;
import pages.AutomationExercisePage;

public class ReusableMethods {

    public static void cookies(){
        try {
            AutomationExercisePage aep=new AutomationExercisePage();
            aep.cookies.click();
        }catch (Exception e){
            System.out.println("Cookie cikmadi");
        }
    }

}
