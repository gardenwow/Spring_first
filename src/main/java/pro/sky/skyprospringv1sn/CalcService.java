package pro.sky.skyprospringv1sn;

import org.springframework.stereotype.Service;

@Service
public class CalcService {


    public String hello(){
        return "Добро пожаловать в калькулятор\nhello man, u can use calculator\n use + - / *";
    }

    public String summaDvyh(int num1, int num2){
        return "your summa = " + String.valueOf(num1 + num2);
    }
    public String sminusDvyh(int num1, int num2){
        return "your minus = " + String.valueOf(num1 - num2);
    }
    public String multiplyDvyh(int num1, int num2){
        return "your minus = " + String.valueOf(num1 * num2);
    }
    public String divineDvyh(int num1, int num2){
        if (num2 != 0) {
            return "your minus = " + String.valueOf(num1 / num2);
        }
        else return "na 0 delit nelzya";
    }
}

