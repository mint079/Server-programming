package fi.haagahelia.server.excercise2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location") String location, @RequestParam(name ="name") String name) {
	return "Welcome to " + location +", " +name;
	}
}
