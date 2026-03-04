package ie.atu.oop.oop_inclass_7.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ie.atu.oop.oop_inclass_7.Class.LaptopLoan;

import java.util.ArrayList;

@RestController
@RequestMapping("/LaptopLoan")
public class LaptopLoanController {
    private final ArrayList<LaptopLoan> list =  new ArrayList<>();
    @GetMapping("/get")
    public ResponseEntity<ArrayList<LaptopLoan>> getList(){
        return ResponseEntity.ok(list);
    }


}
