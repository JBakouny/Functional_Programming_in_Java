import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static Task.sumInts;

public class Tests {
  @Test
  public void testSolution() {
    assertEquals(sumInts(5, 10), 45);
  }
}