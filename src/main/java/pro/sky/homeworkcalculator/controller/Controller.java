package pro.sky.homeworkcalculator.controller;
import org.springframework.web.bind.annotation.*;
import pro.sky.homeworkcalculator.service.CalculatorServiceImp;
import pro.sky.homeworkcalculator.service.HelloServiceImp;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final HelloServiceImp helloServiceImp;
    private final CalculatorServiceImp calculatorServiceImp;

    public Controller(HelloServiceImp helloServiceImp, CalculatorServiceImp calculatorServiceImp) {
        this.helloServiceImp = helloServiceImp;
        this.calculatorServiceImp = calculatorServiceImp;
    }
    @GetMapping()
    public String hello() {
        return helloServiceImp.hello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
        double result = calculatorServiceImp.plus(num1,num2);
        return buildAnswer(num1,num2,result,'+');
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
        double result = calculatorServiceImp.minus(num1,num2);
        return buildAnswer(num1,num2,result,'-');
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
        double result = calculatorServiceImp.multiply(num1,num2);
        return buildAnswer(num1,num2,result,'*');
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
     double result = calculatorServiceImp.divide(num1,num2);
     return buildAnswer(num1,num2,result,'/');
    }

    private static String buildAnswer(double num1, double num2, double result, char c) {
        return String.format("%f %c %f = %f",num1,c,num2,result);
    }

}
