//
//package lk.janani_super.asset.viva.Employee;
//
//import lk.janani_super.asset.common_asset.model.TwoDate;
//import lk.janani_super.asset.employee.service.EmployeeService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.time.LocalDateTime;
//
//@Controller
//@RequestMapping( "/sampleReport" )
//public class VivaController {
//  private final EmployeeService employeeService;
//
//  public VivaController(EmployeeService employeeService) {
//    this.employeeService = employeeService;
//  }
//
//  @GetMapping
//  public String getform(){
//    return "viva/searchForm";
//  }
//
//  @PostMapping( "/search" )
//  public String getAllEmployeesBetweenTwoDate(@ModelAttribute( "Employee" ) TwoDate twoDate, Model model) {
//    String message =
//            "This report is between from " + twoDate.getStartDate().toString() + " to " + twoDate.getEndDate().toString();
//    LocalDateTime startDateTime = dateTimeAgeService.dateTimeToLocalDateStartInDay(twoDate.getStartDate());
//    LocalDateTime endDateTime = dateTimeAgeService.dateTimeToLocalDateEndInDay(twoDate.getEndDate());
//    return commonAll(employeeService.findByCreatedAtIsBetween(startDateTime, endDateTime));
//
//  }
//}