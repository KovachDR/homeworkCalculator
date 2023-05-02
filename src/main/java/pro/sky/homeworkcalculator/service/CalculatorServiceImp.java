package pro.sky.homeworkcalculator.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImp implements CalculatorService{
    @Override
    public String plus(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
        double result = num1 + num2;
        return "Результат вычислений: " + num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(double num1, double num2) {
        double result = num1 - num2;
        return "Результат вычислений: " + num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(double num1, double num2) {
        double result = num1 * num2;
        return "Результат вычислений: " + num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(double num1, double num2) {
    if (num2 != 0){
        double result = num1 / num2;
        return "Результат вычислений: " + num1 + " / " + num2 + " = " + result;
    }throw new ArithmeticException("На ноль делить нельзя");
    }


}
