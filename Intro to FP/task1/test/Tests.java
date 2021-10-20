import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static Task.*;

public class Tests {
  @Test
  public void testSumInts() {
    assertEquals(sumInts(5, 10), 45);
  }

  @Test
  public void testSumCube() {
    assertEquals(sumCube(5, 10), 45);
  }

  @Test
  public void testFact() {
    assertEquals(fact(5), 120);
  }
}