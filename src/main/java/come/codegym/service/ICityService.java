package come.codegym.service;

import come.codegym.model.Cities;

public interface ICityService {
    Cities save(Cities city);
    Iterable<Cities> findAll();
    Cities findById(Long id);
    void delete(Long id);
}
