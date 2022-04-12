package test.java.com.quantcast.mostactivecookie;

import org.junit.Assert;
import org.junit.Test;

import main.java.com.quantcast.mostactivecookie.LogFileUtility;

public class TestCookie {
    private final LogFileUtility logFileReader = new LogFileUtility();
    @Test
    public void readFile() {
        logFileReader.readLogAndCreateMap("cookie_log.csv");
        Assert.assertEquals("AtY0laUfhglK3lC7", logFileReader.findMostActiveCookie("2018-12-09",logFileReader.getCookieLogs()).get(0));
    }
}
