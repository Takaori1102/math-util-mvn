
import com.danh.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    //TEST CASE TEMPLATE / STRUCTURE
    //ID | DESC | STEPS/PROCEDURE | EXPECTED VALUE | STATUS (PASSED/FAILED)
    //Test Case #1: Verify the getFactorial() function with n=0
    //Steps/procedures:
    //                  1. Given n = 0
    //                  2. Call/invoke getFactorial()
    //Expected Result 
    //                  The method getFactorial(n=0) must return 1
    //                  as the result of 0! == 1
    //Status:           PASSED | FAILED (ĐOÁN XEM KHI CHẠY APP/ HÀM / METHOD
    @Test //dính dáng thuật ngữ FrameWork
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //Test Case #2: Verify the getFactorial() function with n=0
    @Test //dính dáng thuật ngữ FrameWork
    public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //Test Case #3: Verify the getFactorial() function with n=6
    @Test //dính dáng thuật ngữ FrameWork
    public void verifyFactorialGivenRightArgument6ReturnOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
