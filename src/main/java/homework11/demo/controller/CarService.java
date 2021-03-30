package homework11.demo.controller;


import homework11.demo.model.entity.CarEntity;
import homework11.demo.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository repo;

    public List<CarEntity> getAll(){
        return repo.findAll();
    }

//    public void save (CarEntity carEntity){
//        repo.save(carEntity);
//    }
//    public CarEntity get(Integer id){
//        return repo.findById(id).get();
//    }
//    public void delete(Integer id){
//        repo.deleteById(id);
//    }
}
