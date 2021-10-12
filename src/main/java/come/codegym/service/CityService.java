package come.codegym.service;

import come.codegym.model.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import come.codegym.repository.ICityRepo;

@Service
public class CityService implements ICityService {
    @Autowired
    ICityRepo cityRepo;
    @Override
    public Cities save(Cities city) {
        return cityRepo.save(city);
    }

    @Override
    public Iterable<Cities> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public Cities findById(Long id) {
        return cityRepo.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        cityRepo.deleteById(id);
    }
}
