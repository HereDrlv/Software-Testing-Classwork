import java.util.Arrays;
import java.util.Collection;

import org.junit.experimental.categories.Category;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


// public interface FastTests { /* category marker */ }
// public interface SlowTests { /* category marker */ }





@RunWith(Parameterized.class)//固定写法
public class wcTest {

    @Before
    public void before() {
        System.out.println("@Before");
    }

    @Parameters
    // 每个测试类的实例都会以这里面的参数来生成
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 0, 0 }, { 1, 1 }
           });
    }
    private int a;
    private int b;
    //上面的para会传到constructor里。(所以必须写constructor)
    //这样，每次new 一个新的wcTest对象，以一组参数传入
    public wcTest(int a , int b){
        this.a = a;
        this.b = b;
    }

    // Assertion: https://github.com/junit-team/junit4/wiki/Assertions
    @Test
    public void assertEqual() {
        wc wordCountor = new wc();
        //再在下面写10个测试用例就行了
        //先写第一个
        String dir_0 = "";
        String fileClass_0 = "F:\\codes\\java\\try\\src\\test.txt";
        wordCountor.iteratorPath(dir_0, fileClass_0);
        // assertEquals("", wordCountor.or);//这个生效了。
        // wc.or
        // wc.file
        // wc.filePath
        // assertEquals(6, sum);// 测试用例-assert used for assure the outtput
        // assertEquals(10,wordCountor.evaluate("1+2+3+4"));
    }
    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
    }

    @After
    public void after() {
        System.out.println("@After");
        System.out.println("WordCount test finnished running");
    }

}