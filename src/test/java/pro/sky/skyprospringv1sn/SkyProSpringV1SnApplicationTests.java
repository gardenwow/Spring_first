package pro.sky.skyprospringv1sn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class SkyProSpringV1SnApplicationTests {
	private int num1;
	private int num2;

	@BeforeEach
	public void setUp(){
		List <Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,345, 0, 0, 0, 1235,56456));
		Random rand = new Random();
		num1 = nums.get(rand.nextInt(nums.size()));
		num2 = nums.get(rand.nextInt(nums.size()));
		//num2 = 0;
	}
	@Test
	public void divineTwoTest() {
		CalcService calcService = new CalcService();
		if (num2 == 0){
			throw new IllegalArgumentException();
		}
		double stable = calcService.divineDvyh(num1,num2);
		double divineNums = num1/num2;
		Assertions.assertEquals(divineNums, stable);
	}

	@Test
	public void plusTwoTest() {
		CalcService calcService = new CalcService();
		double stable = calcService.summaDvyh(num1,num2);
		double plusNums = num1+num2;
		Assertions.assertEquals(plusNums, stable);
	}
	@Test
	public void minusTwoTest() {
		CalcService calcService = new CalcService();
		double stable = calcService.sminusDvyh(num1,num2);
		double minusNums = num1-num2;
		Assertions.assertEquals(minusNums, stable);
	}
	@Test
	public void multiplyTwoTest() {
		CalcService calcService = new CalcService();
		double stable = calcService.multiplyDvyh(num1,num2);
		double multyNums = num1*num2;
		Assertions.assertEquals(multyNums, stable);
	}


}
