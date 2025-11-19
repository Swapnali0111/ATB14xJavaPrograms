package Ex_19_OOP_Inheritance.single_inheritance;

public class TestCase1 extends CommonToAll {

    void runTC1()
    {
        startBrowser();
        System.out.println("TC1 is running");
        closeBrowser();

        readExcelFile();
    }
}
