package springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springjdbc.DVDInfo;
import springjdbc.bo.KioskService;

import java.util.Date;
import java.util.List;


public class TestClient {
    public static void main(String args[]) {
        TestClient testClient = new TestClient();
        testClient.test();
    }

    public void test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:ApplicationContext.xml");
        KioskService kioskService = (KioskService) context.getBean("KioskService");

        String searchTitle = "x";
        List<DVDInfo> result = kioskService.searchByTitle(searchTitle);
        if (result.size() == 0) {
            System.out.println("Error, a DVD with title containing " + searchTitle + " should be available at location 'AMS-LC0'");
            return;
        }
        System.out.println("Found " + result.size() + " dvds containing " + searchTitle + " In title");
        DVDInfo dvdInfo = result.get(0);
        int id = kioskService.loanDVD(dvdInfo.getId(), "j.wirth", "whoknows", new Date(), "LAS-LC0");
        System.out.println("Added Loan " + id);
    }

}
