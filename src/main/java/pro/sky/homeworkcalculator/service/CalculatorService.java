package pro.sky.homeworkcalculator.service;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    String plus(@RequestParam("num1") double num1,
                @RequestParam("num2") double num2);
    String minus(@RequestParam("num1") double num1,
                 @RequestParam("num2") double num2);

    String multiply(@RequestParam("num1") double num1,
                    @RequestParam("num2") double num2);
    String divide(@RequestParam("num1") double num1,
                  @RequestParam("num2") double num2);

}
