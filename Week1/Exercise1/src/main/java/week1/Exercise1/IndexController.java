package week1.Exercise1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
		}
	
}

