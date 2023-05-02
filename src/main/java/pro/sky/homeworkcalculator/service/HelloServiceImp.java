package pro.sky.homeworkcalculator.service;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService{

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
}
