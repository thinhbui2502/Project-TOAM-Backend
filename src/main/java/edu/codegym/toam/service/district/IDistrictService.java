package edu.codegym.toam.service.district;


import edu.codegym.toam.model.Cities;
import edu.codegym.toam.model.Districts;

public interface IDistrictService {
    Iterable<Districts> findAllDistrict();
}
