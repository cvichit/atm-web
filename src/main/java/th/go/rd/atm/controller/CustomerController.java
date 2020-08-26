package th.go.rd.atm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/customer")
public class CustomerController{
    private ArrayList<Customer> customers = new ArrayList<>();

    @GetMapping
    public String getCustomerPage(Model model) {
        model.addAttribute("allCustomers", customers);
        return "customer"; // customer.html
    }
    @PostMapping
    public String registerCustomer(@ModelAttribute Customer customer, Model model){
        customers.add(customer);
        model.addAttribute("allCustomers",customers);
        return "redirect:customer";
    }
}
