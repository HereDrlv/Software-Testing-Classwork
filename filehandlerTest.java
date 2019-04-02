import org.junit.Before;  
import org.junit.Test;
import org.junit.After;  
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class filehandlerTest {
  @Before
  public void before() {  
    System.out.println("@Before");  
  }  
  @Test
  public void assertEqual() {
    Filehandler fhandler = new Filehandler();
    // String path, int isStop, String[] StopList
    // fhandler.FileHandle()
    // assertEquals("", wordCountor.or);//这个生效了。
  }
  @Test
  public void testAssertNull() {
    assertNull("should be null", null);
  }

  @After  
  public void after() {  
    System.out.println("@After");  
    System.out.println("filehandler test finnished running");  
  } 
  
}