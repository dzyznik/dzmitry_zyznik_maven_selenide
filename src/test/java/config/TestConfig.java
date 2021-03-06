package config;

public class TestConfig {

    public static String browser = "chrome";
    public static String headless = "0";

    public static void initConfig(String webBrowser) {
        browser = System.getProperty("browser") == null ? webBrowser : System.getProperty("browser");
        headless = System.getProperty("headless") == null ? "0" : System.getProperty("headless");
    }

    public static boolean isHeadless() {
        return headless.contains("1");
    }
}

