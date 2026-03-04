package ie.atu.oop.oop_inclass_7.Service;

import ie.atu.oop.oop_inclass_7.Class.LaptopLoan;
import org.springframework.stereotype.Service;

@Service
public class LaptopLoanService {
    LaptopLoan laptopLoan =  new LaptopLoan();

    public LaptopLoan getLaptopLoan(){
        return laptopLoan;
    }

    public void setLaptopLoan(LaptopLoan laptopLoan){
        this.laptopLoan = laptopLoan;
    }
}
