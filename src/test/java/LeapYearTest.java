import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true() {
    LeapYear LeapYear = new LeapYear();
    assertEquals(true, LeapYear.isLeapYear(2012));
  }
}
