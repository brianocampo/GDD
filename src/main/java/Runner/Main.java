
package Runner;

import org.testng.*;


public class Main {


    public static void main(String[] args) {
        
        TestNG TN = new TestNG();
        TN.setTestClasses(new Class[]{Test.LoginTest.class});
        TN.run(); 
        
    }
    
}
