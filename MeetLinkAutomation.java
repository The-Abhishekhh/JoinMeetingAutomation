package seleni;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class MeetLinkAutomation {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the Google Meet automation script.");

        // Path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/abhik/SeleniumBasics/chromedriver.exe");

        // Path to your Chrome profile
        String userProfile = "C:/Users/abhik/AppData/Local/Google/Chrome/User Data"; // Update this path

        // Set up Chrome options to use the existing profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + userProfile);
        options.addArguments("--profile-directory=Default"); // Use the default profile
        options.addArguments("--disable-extensions"); // Disable extensions

        // Create ChromeDriver instance with the options
        WebDriver driver = new ChromeDriver(options);

        // Define the time to join the meeting
        LocalTime meetingTime = LocalTime.of(11, 31); // Replace with your desired time

        // Calculate the delay until the meeting time
        long delayInSeconds = LocalTime.now().until(meetingTime, ChronoUnit.SECONDS);

        // Wait until the specified time to join the meeting
        if (delayInSeconds > 0) {
            System.out.println("Waiting until the meeting time...");
            TimeUnit.SECONDS.sleep(delayInSeconds);
        }

        // Open the Google Meet link
        String meetingLink = "https://meet.google.com/xuh-nbfm-ffw"; // Replace with your meeting link
        driver.get(meetingLink);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for the page to load completely
        TimeUnit.SECONDS.sleep(10);

        try {
            // Find and click the "Join now" button
            WebElement joinNowButton = driver.findElement(By.xpath("//span[text()='Join now']"));
            joinNowButton.click();
            System.out.println("Clicked 'Join now' button.");
        } catch (Exception e) {
            System.out.println("'Join now' button not found. Checking for 'Ask to join' button.");
            try {
                // Find and click the "Ask to join" button
                WebElement askToJoinButton = driver.findElement(By.xpath("//span[text()='Ask to join']"));
                askToJoinButton.click();
                System.out.println("Clicked 'Ask to join' button.");
            } catch (Exception ex) {
                System.out.println("Neither 'Join now' nor 'Ask to join' buttons were found.");
            }
        }

        // Keep the browser open for the duration of the meeting
        TimeUnit.MINUTES.sleep(60); // Adjust the sleep time based on the length of the meeting

        // Close the browser
        driver.quit();
    }
}
