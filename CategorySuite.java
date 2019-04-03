// package junitexamples.Categories;
 
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//这就是分组的写法
@RunWith(Categories.class)
@Categories.IncludeCategory(OneCategoryInterface.class)
//一个接口。是空的。固定写法。代表一个分组

@Suite.SuiteClasses( { filehandlerTest.class, wcTest.class })
// Note that Categories is a kind of Suite

public class CategorySuite {}//just remains empty

//如果只有一个分类，则category的效果等同于Suite，把所有的用例类整进一个Suite
//如果给多个Test class中的多个用例都标记了不同的测试分类
//则category将多个test  class包进一个Suite，且选择性地运行某一类的用例