/*package com.kea.weatherrestapi.Controller;

import com.kea.weatherrestapi.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    WeatherService weatherService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("weatherList", weatherService.display());
        return "index";
    }
}
    @PostMapping("/index")
    public String saveData(@ModelAttribute Weather weather){
        weatherService.insert(weather);
        return "redirect:/index";
    }
}*/
