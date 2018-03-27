package dataConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mitet0 on 3/27/2018
 */
@RestController
@RequestMapping("/dateConverter")
public class DataConverterController {
    private final DataConverterService dateService;

    @Autowired
    public DataConverterController(DataConverterService dateService) {
        this.dateService = dateService;
    }

    @RequestMapping("")
    public String returnDay(@RequestParam(value = "date") String date ) {
        return dateService.converter(date);
    }

}
