package pluralsight.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
	
	@Value("${rate}")
	String rate;
	@Value("${lanecount}")
	String lanecount;
	@Value("${tollstart}")
	String tollstart;
	
	@Value("${connstring}")
	String connstring;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rateamount", this.rate);
		m.addAttribute("lanes", this.lanecount);
		m.addAttribute("tollstart", this.tollstart);
		m.addAttribute("connstring", connstring);
		
		return "rateview";
	}

}
