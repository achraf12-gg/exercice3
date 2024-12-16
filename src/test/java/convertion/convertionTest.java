package convertion;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class convertionTest {
    @Test

public void testconvert(){

    //GIVEN
    ArabicRomanNumerals number=new ArabicRomanNumerals();
    //WHEN
    String result = number.convert(3);
    //THEN
    assertThat(result).isEqualTo("III");

}


}
