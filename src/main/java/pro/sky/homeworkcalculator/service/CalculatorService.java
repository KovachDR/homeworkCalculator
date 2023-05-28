package pro.sky.homeworkcalculator.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    double plus(@RequestParam("num1") double num1,
                @RequestParam("num2") double num2);

    double minus(@RequestParam("num1") double num1,
                 @RequestParam("num2") double num2);

    double multiply(@RequestParam("num1") double num1,
                  @RequestParam("num2") double num2);

    double divide(@RequestParam("num1") double num1,
                @RequestParam("num2") double num2);

}
