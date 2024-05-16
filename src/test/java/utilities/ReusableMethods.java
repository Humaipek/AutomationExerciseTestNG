package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AutomationExercisePage;

public class ReusableMethods {

    public static void cookies(WebElement element){
        try {
            element.click();
        }catch (Exception e){
            System.out.println("Cookie cikmadi");
        }
    }

}
