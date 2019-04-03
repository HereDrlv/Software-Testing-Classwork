import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
//only suite Test
@Suite.SuiteClasses({
    wcTest.class,
    filehandlerTest.class
})// 这样就可以把两个Test类在一个suite里都跑
/// 但是不知道为什么会跑两次，先不管了
public class TestSuite {
}