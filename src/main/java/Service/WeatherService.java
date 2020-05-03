package Service;

import Model.WeatherOld;
import Repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    @Autowired
    WeatherRepo weatherRepo;

    public List<WeatherOld> display() {
        return weatherRepo.findAll();
    }
}
/*
    public void insert(WeatherOld weather){
        weatherRepo.save(weather);
    }

}*/
