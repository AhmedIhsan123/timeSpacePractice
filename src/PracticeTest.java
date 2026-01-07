import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  public void testMostCommonNumber(){
    int[] nums = {1,2,2,3};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(2, actual);
  }

  @Test
  public void testTieReturnsFirst(){
    int[] nums = {4,5,4,5};
    int actual = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(4, actual);
  }

    @Test
  public void testTimeMostCommonNumber(){
    int[] nums = {35, 32, 66, 23, 23, 32, 45, 32, 23};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(32, actual);
  }

  @Test
  public void testTimeTieReturnsFirst(){
    int[] nums = {6,6,2,2,3,3,3,6};
    int actual = Practice.mostCommonTimeEfficient(nums);
    assertEquals(6, actual);
  }
}
