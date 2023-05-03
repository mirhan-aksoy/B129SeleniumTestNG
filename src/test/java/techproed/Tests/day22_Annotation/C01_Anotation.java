package techproed.Tests.day22_Annotation;

import org.testng.annotations.*;

public class C01_Anotation {
   /*
@Test:Testlerimizi yazmak icin kullandigimiz notasyon
@BeforeSuite:Her bir test suite'inden once bir kez calisir.
@AfterSuite:Her bir test suite'inden once bir sonra calisir.
@BeforeTest:Her bir test oncesi bir kez calisir.
@AfterTest:Her bir test sonrasi bir kez calisir.
@BeforeClass:Her bir class'tan once bir kez calisir.
@AfterClass:Her bir class'tan sonra bir kez calisir.
@BeforeMethod:her bir test method'dundan once bir kez calisir=> JUnit'teki @Before
@AfterMethod:her bir test method'dundan sonra bir kez calisir=> JUnit'teki @After
--TestNG de @BeforeGroups,@AfterGroups,@FindBy gibi notasyonlarda vardir bunlari ileriki konularda
gorecegiz.
 */

    @Test
    public void test1(){
        System.out.println("Test 1 Çalıştı");
    }
    @Test
    public void test2() {
        System.out.println("Test 2 Çalıştı");
    }
    @Test
    public void test3() {
        System.out.println("Test 3 Çalıştı");
    }
    @Test
    public void test4() {
        System.out.println("Test 4 Çalıştı");
    }
    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
    /*
    --TestNG de @BeforeGroups,@AfterGroups,@FindBy gibi notasyonlarda vardir bunlari ileriki konularda
gorecegiz.
--jUnit'te @BeforeClass ve @AfterClass notasyonuna sahip methodlar static olmak ZORUNDAYDI.
TestNG frameworkunde boyle bir zorunluluk yoktur.
 Before Suite
Before Test
Before Class
Before Method
Test 1 Çalıştı
After Method
Before Method
Test 2 Çalıştı
After Method
Before Method
Test 3 Çalıştı
After Method
Before Method
Test 4 Çalıştı
After Method
After Class
After Test
After Suite
     */
}
