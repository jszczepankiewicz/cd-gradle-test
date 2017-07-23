package jszczepankiewicz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jszczepankiewicz
 * @since 2017-07-22
 */
public class MainTestIT {

  private Main main = new Main();

  @Test
  public void shouldBeFineInIntegrationTestToo() {
    assertThat(main.whatsTheNumber()).isEqualTo(3);
  }

  @Test
  public void shouldShowUniqueForITCoverage() {
    assertThat(main.whatsTheNumberForIntegrationTest()).isEqualTo(5);
  }
}
