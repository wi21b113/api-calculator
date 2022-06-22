package at.technikum.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //is senden json files, @controller would send html, looking for example hello.html
public class CalculatorController {

    /*
    @GetMapping("/")
    //@RequestMapping() -> GET POST DELETE PATCH PUT
    public String index(){
        return "Hello";
    }
     */

    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return a +b;
    }

}
