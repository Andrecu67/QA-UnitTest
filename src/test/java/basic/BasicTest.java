package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @BeforeEach
    public void before (){
        System.out.println("before");
        //requirement -> setup / initialize
    }

    @Test
    public  void verifySomeThing (){
        System.out.println("Test1");
        //STEP
        //STEP
        //VERIFICATION
    }

    @Test
    public  void verifySomeThing2 (){
        System.out.println("Test2");
        //STEP
        //STEP
        //VERIFICATION
    }

    @AfterEach
    public void after (){
        System.out.println("After");
        // cleanup / tear down
    }
}
