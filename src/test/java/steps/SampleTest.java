package steps;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SampleTest extends BaseTest {

//    @Test
//    public void testGoogleSearch() throws InterruptedException {
//        page.navigate("https://www.google.com");
//        String title = page.title();
////        Assert.assertEquals(title, "Google");
//        
//        Thread.sleep(10000);
//    }

    @Test
    public void testBingSearch() throws InterruptedException {
        page.navigate("https://www.bing.com");
        String title = page.title();
//        System.out.println("title="+title);
//        Assert.assertEquals(title, "Bing");
        Thread.sleep(10000);
    }
}
