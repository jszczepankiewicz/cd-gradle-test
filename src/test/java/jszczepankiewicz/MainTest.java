package jszczepankiewicz;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jszczepankiewicz
 * @since 2017-07-22
 */
public class MainTest {

  private Main main = new Main();

  @Test
  public void shouldBeFine(){
    assertThat(main.whatsTheNumber()).isEqualTo(3);
  }
}