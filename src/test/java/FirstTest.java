import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstTest {
    //Кратно 3, возвращать 'Т'
    //Кратно 5, возвращать 'М'
    //Кратно 3 и 5, возвращать 'ТИМ'
    //возвращать 'fail'

    public String trialCode(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "TИМ";
        } else if (number % 5 == 0) {
            return "M";
        } else if (number % 3 == 0) {
            return "T";
        } else return "FAIL";
    }

    @Test
    public void timTest() {
        String actualResult = trialCode(9);
        assertEquals(actualResult, "T");
    }

    @Test
    public void timTest1() {
        String actualResult = trialCode(25);
        assertEquals(actualResult, "M");
    }

    @Test
    public void timTest2() {
        String actualResult = trialCode(15);
        assertEquals(actualResult, "TИМ");
    }
}

