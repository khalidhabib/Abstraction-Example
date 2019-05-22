package com.khalid.Controller;

import com.khalid.dto.CarDTO;
import com.khalid.core.BaseController;
import com.khalid.core.CurdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController extends BaseController<CarDTO> {

    @Autowired
    public CarController(CurdService<CarDTO> service) {
        super(service);
    }
}
