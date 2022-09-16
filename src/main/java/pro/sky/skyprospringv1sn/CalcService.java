package pro.sky.skyprospringv1sn;

import org.springframework.stereotype.Service;

@Service
public class CalcService implements CalcServiceInterf {


    public String hello(){
        return "Добро пожаловать в калькулятор\nhello man, u can use calculator\n use + - / *";
    }
@Override
    public int summaDvyh(int num1, int num2){
        return num1 + num2;
    }
    @Override
    public int sminusDvyh(int num1, int num2){
        return num1 - num2;
    }
    @Override
    public int multiplyDvyh(int num1, int num2){
        return num1 * num2;
    }
    @Override
    public int divineDvyh(int num1, int num2){
            return num1 / num2;
        }
}

