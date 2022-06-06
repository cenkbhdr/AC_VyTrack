package com.vyTrack.test_Features;

import com.vyTrack.utilities.Driver;
import org.openqa.selenium.WebDriver;

public class US_01_TC1_LoginFunctionality_AllCorrect {
    /**  US_01 Login Functionality
     *      TC_01 All Correct Credentials
     *
     * Given  at LoginPage
     * When input correct username to usernameBox
     * And input correct password to passwordBox
     * And clicking on LoginBtn
     * Then should navigate to DashboardPage
     */
    public static void main(String[] args) {


        //1.
        WebDriver driver = Driver.getWebDriver();

        //2.Navigate to https://qa2.vytrack.com/user/login
        driver.get("https://qa2.vytrack.com/user/login");

        //3. Login page Title Verification

    }
}
