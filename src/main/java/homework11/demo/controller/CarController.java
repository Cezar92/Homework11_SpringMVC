package homework11.demo.controller;

import homework11.demo.model.entity.CarEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/vehicules")

public class CarController {

    private final CarService service;
//    @PostConstruct
//    public void user (){
//    }

    @RequestMapping(method= RequestMethod.GET,path = "/show")
    public String viewHomePage(Model model){
        List<CarEntity> listauto = service.getAll();
        model.addAttribute("listCars",listauto);

        return "listCars";

    }
}
