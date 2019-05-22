package com.example.Controller;

import com.example.dto.CarDTO;
import com.example.core.BaseController;
import com.example.core.CurdService;
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
