package pro.sky.skyprospringv1sn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String hello() {
        return calcService.hello();
    }

    @GetMapping(path = "/plus")
    public String summaDvyh(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "your summa = " + calcService.summaDvyh(num1, num2);

    }

    @GetMapping(path = "/minus")
    public String minusDvyh(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "your minus = " + calcService.sminusDvyh(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplyDvyh(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return "your ymnojenie = " + calcService.multiplyDvyh(num1, num2);
    }

    @GetMapping(path = "/divine")
    public String divineDvyh(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 != 0) {
            return "your delenie = " + calcService.divineDvyh(num1, num2);
        } else {return "na 0 delit nelzya";}
    }
}