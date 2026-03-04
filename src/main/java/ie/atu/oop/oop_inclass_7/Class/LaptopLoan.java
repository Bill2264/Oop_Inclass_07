package ie.atu.oop.oop_inclass_7.Class;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class LaptopLoan {
    @NotBlank
    private int loanId;
    @NotBlank
    private String loanTag;
    @Email
    private String studentEmail;
    @DateTimeFormat
    private String loanDate;
    @NotBlank
    private int startHour;
    @NotBlank
    private int durationHours;

    public LaptopLoan() {
        loanId = 0;
        loanTag = "";
        studentEmail = "";
        loanDate = "";
        startHour = 0;
        durationHours = 0;
    }
}
