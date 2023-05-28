package pro.sky.homeworkcalculator.service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.homeworkcalculator.exceptions.ZeroDivideException;

@Service
public class CalculatorServiceImp implements CalculatorService{
    @Override
    public double plus(@RequestParam("num1") double num1,
                       @RequestParam("num2") double num2) {
        return num1 + num2;
    }

    @Override
    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
    if (num2 != 0){
        return num1 / num2;
    }throw new ZeroDivideException();
    }


}
