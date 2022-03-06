package utils;

import pages.DesktopCalculatorPage;
import pages.TestProjectFormPage;
import pages.TestProjectLoginPage;

/**
 * This class used for page initialization.
 */
public class ManagePages {

    // Web Pages
    public static TestProjectLoginPage testProjectLoginPage;
    public static TestProjectFormPage testProjectFormPage;

    // Desktop Pages
    public static DesktopCalculatorPage desktopCalculatorPage;

    /**
     * This method initializes web pages.
     */
    public static void initWebPages() {
        testProjectLoginPage = new TestProjectLoginPage(DriverManager.driver);
        testProjectFormPage = new TestProjectFormPage(DriverManager.driver);
    }


    /**
     * This method initializes desktop pages.
     */
    public static void initDesktopPages() {
        desktopCalculatorPage = new DesktopCalculatorPage(DriverManager.driver);
    }


    /**
     * This method initializes mobile pages.
     */
    public static void initMobilePages() {
        // Mobile pages
    }
}
