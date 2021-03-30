package homework11.demo.controller;

import homework11.demo.model.entity.CarEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/")

public class CarController {

    private final CarService service;
//    @PostConstruct
//    public void user (){
//    }

    @RequestMapping( "/")
    public String viewHomePage(Model model){
        List<CarEntity> listauto = service.getAllCars();
        model.addAttribute("listCars",listauto);

        return "cars";
    }

    @RequestMapping("/new")
    public String showNewCar(Model model) {
        CarEntity newCar = new CarEntity();
        model.addAttribute("newCar", newCar);
        return "newCar";

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCar(@ModelAttribute("CarEntity") CarEntity car) {
        service.save(car);
        return "redirect:/";
    }
}
