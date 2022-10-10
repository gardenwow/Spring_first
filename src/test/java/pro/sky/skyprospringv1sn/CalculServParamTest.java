package pro.sky.skyprospringv1sn;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculServParamTest {
    private final CalcService calcService = new CalcService();

    @ParameterizedTest
    @MethodSource("params")
    public void testPlusUnit(int a, int b){
        int result = calcService.summaDvyh(a,b);
        assertEquals(a + b,result);

    }
    @ParameterizedTest
    @MethodSource("params")
    public void testMinusUnit(int a, int b){
        int result = calcService.sminusDvyh(a,b);
        assertEquals(a - b,result);

    }
    @ParameterizedTest
    @MethodSource("params")
    public void testDivideUnit(int a, int b){
        int result = calcService.divineDvyh(a,b);
        assertEquals(a / b,result);

    }
    @ParameterizedTest
    @MethodSource("params")
    public void testMultysUnit(int a, int b){
        int result = calcService.multiplyDvyh(a,b);
        assertEquals(a * b,result);

    }
    private static Stream<Arguments> params(){
        return Stream.of(
                Arguments.of(10,2),
                Arguments.of(5,5),
                Arguments.of(3,1),
                Arguments.of(562,5)
        );
    }
}
