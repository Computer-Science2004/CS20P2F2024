package Events;
// Add Phidgets Library
import com.phidget22.*;
public class AttachDetachEvents {
   public static void main(String[] args) throws Exception {
     
       // Create objects for the Red Button and Red LED
       DigitalInput redButton = new DigitalInput(); // Red Button input
       DigitalOutput redLED = new DigitalOutput(); // Red LED output
       // Address Red Button and Red LED to their respective ports
       redButton.setHubPort(0); // Red Button port 0
       redButton.setIsHubPortDevice(true); // Set as Hub Port device
       redLED.setHubPort(1); // Red LED port 1
       redLED.setIsHubPortDevice(true); // Set as Hub Port device
       // Attach event for Red Button
       redButton.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach Red Button"); // Print Red Button is attached
           }
       });
       // Detach event for Red Button
       redButton.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach Red Button"); // Print Red Button is detached
           }
       });
       // Attach event for Red LED
       redLED.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Attach Red LED"); // Print Red LED is attached
           }
       });
       // Detach event for Red LED
       redLED.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Detach Red LED"); // Print Red LED is detached
           }
       });
       // Open connections to Red Button and Red LED (timeout if not connected in 1 second)
       redButton.open(1000);
       redLED.open(1000);
       // Event for Red Button state change to turn on LED
       redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
           public void onStateChange(DigitalInputStateChangeEvent e) {
               try {
                   redLED.setState(e.getState()); // Turn Red LED on when button is pressed and off when released
               } catch (PhidgetException e1) {
                   e1.printStackTrace();
               }
           }
       });
       Thread.sleep(2000); // Wait for 2 seconds just to make sure everything can happen
       while (true) {
           Thread.sleep(10); // Small delay to ensure the outputs and responses are fast
       }
   } // Close main method
} // Close public class AttachDetachEvents

