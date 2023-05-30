package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String printWelcome(Model model,
                               @RequestParam(value = "number", required = false) Integer i) {
        if (i == null || i > 5)  i = 5;
        List<Car> catList = new ArrayList<>();
        Collections.addAll(catList, new Car("BMW", 134, "E60"),
                new Car("Chevrolet", 411, "Impala"),
                new Car("YAZ", 777, "Patriot"),
                new Car("Renault", 131, "Logan"),
                new Car("Mitsubishi ", 141, "Lancer"));
        catList = catList.stream().limit(i).toList();
        model.addAttribute("cars", catList);
        return "cars";
    }
}
