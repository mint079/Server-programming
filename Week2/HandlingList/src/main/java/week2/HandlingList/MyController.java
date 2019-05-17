package week2.HandlingList;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import week2.domain.Student;

@Controller

public class MyController {
	@RequestMapping("/hello")
	public String messages( Model model){
		List<Student> studentArray = new ArrayList<Student>();
		Student student = new Student("a", "b");
		studentArray.add(student);
		student = new Student("w", "de");
		studentArray.add(student);
		student = new Student("adew", "dew");
		studentArray.add(student);
		student = new Student("a", "b");
		studentArray.add(student);
		student = new Student("dfgerijuiu", "sa");
		studentArray.add(student);
		model.addAttribute("studentlist", studentArray);
		return"list";
	}
}