package Controller;

import Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/index11")
    public String index(Model model) {
        model.addAttribute("weatherList", weatherService.display());
        return "index11";
    }
}
    /*@PostMapping("/index")
    public String saveData(@ModelAttribute Weather weather){
        weatherService.insert(weather);
        return "redirect:/index";
    }
}*/
