package fi.haagahelia.FriendList.web;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import fi.haagahelia.FriendList.domain.Friend;

@Controller
public class FriendController {
	List<Friend> friendList;
	 @RequestMapping(value="/index", method=RequestMethod.GET)
	 public String addFriendAndPrint(@RequestParam(value="friend", required=false) String name, Model model) {
			if(this.friendList == null) {
				this.friendList = new ArrayList<Friend>();
			}
			
			if(name != null) {
				friendList.add(new Friend(name)) ;
			}
			
			model.addAttribute("friendList", friendList);
			
			return "welcome";
			
	}
}
