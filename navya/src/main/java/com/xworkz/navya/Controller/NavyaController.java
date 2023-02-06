package com.xworkz.navya.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.navya.dto.BeverageDTO;
import com.xworkz.navya.dto.ChatDTO;
import com.xworkz.navya.dto.EducationDTO;
import com.xworkz.navya.dto.FamilyDTO;
import com.xworkz.navya.dto.MobileDTO;
import com.xworkz.navya.dto.NavyaDTO;


@Component
@RequestMapping("/")
public class NavyaController 
{
	public NavyaController()
	{
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	@GetMapping("/mail")
	public String onMail(Model model)
	{
		System.out.println("Running the onMail....");
		model.addAttribute("email","navya@gmail");
		return "index.jsp";
	}
	@GetMapping("/mobile")
	public String onmobile(Model model)
	{
		System.out.println("Running the onmobile....");
		model.addAttribute("mobile","788772928");
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
	public String onadhar(Model model)
	{
		System.out.println("Running the onadhar....");
		model.addAttribute("adhar","2342 5543 5677");
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onage(Model model)
	{
		System.out.println("Running the onAge....");
		model.addAttribute("age","30");
		return "index.jsp";
	}
	@GetMapping("/dob")
	public String ondob(Model model)
	{
		System.out.println("Running the on dob....");
		model.addAttribute("dob","27/02/1999");
		return "index.jsp";
	}
	@GetMapping("/desiredSal")
	public String ondesiredSal(Model model)
	{
		System.out.println("Running the on desiredSal....");
		model.addAttribute("desiredSal","40000");
		return "index.jsp";
	}
	
	@GetMapping("/friendslist")
	public String onfriendslist(Model model)
	{
		System.out.println("Running the on friendslist....");
		List<String> ref = new ArrayList<String>();
		ref.add("chai");
		ref.add("Raki");
		ref.add("Shine");
		ref.add("muttu");
		ref.add("Darshu");
		model.addAttribute("friendslist",ref);
		return "index.jsp";
	}
	@GetMapping("/visitedPlace")
	public String onVisitedPlace(Model model)
	{
		System.out.println("Running the on VisitedPlace....");
		List<String> ref1 = new ArrayList<String>();
		ref1.add("Shimogga");
		ref1.add("sagar");
		ref1.add("Kundapura");
		ref1.add("sirsi");
	
		model.addAttribute("visitedPlace",ref1);
		return "index.jsp";
	}
	
	@GetMapping("/listofSkills")
	public String onListofSkills(Model model)
	{
		System.out.println("Running the on listofSkills...");
		List<String> ref1 = new ArrayList<String>();
		ref1.add("core java");
		ref1.add("HTML");
		ref1.add("CSS");
		ref1.add("SQL");
	
		model.addAttribute("listofSkills",ref1);
		return "index.jsp";
	}
	
	
 
	
	@GetMapping("/e")
	public String onEducationDTO( Model model)
	{
		System.out.println("running Details of education");
		
		EducationDTO dto = new EducationDTO();
		dto.setDegree("MCA");
		dto.setBranch("Computer Application");
		dto.setCourse("mca");
		dto.setYear(2022);
		model.addAttribute("dispalyDegree", dto.getDegree());	
		model.addAttribute("dispalyCourse", dto.getCourse());
		model.addAttribute("dispalyBranch", dto.getBranch());
		model.addAttribute("dispalyyear", dto.getYear());
		return "index.jsp";
	}
	

@GetMapping("/f")
public String onFamilyDTO( Model model)
{
	System.out.println("running Details of education");
	
	FamilyDTO dto = new FamilyDTO();
	dto.setFatherName("Appaji");
	dto.setMotherName("Maa");
	dto.setSisters("akka tangi");
	dto.setBorthers("anna");
	dto.setGrandFather("ajja");
	dto.setGrandMother("ajji");
	dto.setCousin("tamma");
	dto.setUncle("chikkappa");
	dto.setAunts("chikkamma");
	dto.setNices("atte");
	model.addAttribute("fatherName", dto.getFatherName());	
	model.addAttribute("motherName", dto.getMotherName());
	model.addAttribute("sisters", dto.getSisters());
	model.addAttribute("borthers", dto.getBorthers());
	model.addAttribute("cousin", dto.getGrandFather());
	model.addAttribute("grandFather", dto.getGrandMother());
	model.addAttribute("grandMother", dto.getCousin());
	model.addAttribute("uncle", dto.getUncle());
	model.addAttribute("aunts", dto.getAunts());
	model.addAttribute("nices", dto.getNices());

	return "index.jsp";
}
@GetMapping("/m")
public String onMobileDTO( Model model)
{
	System.out.println("running Details of onMobileDTO");
	
	MobileDTO dto = new MobileDTO();
	dto.setName("one+");
	dto.setPrice(25000);
	dto.setSize("big");
	dto.setModel("new");
	dto.setColor("grey");
	
	model.addAttribute("name", dto.getName());	
	model.addAttribute("price", dto.getPrice());
	model.addAttribute("size", dto.getSize());
	model.addAttribute("model", dto.getModel());
	model.addAttribute("color", dto.getColor());	
	return "index.jsp";
}

@GetMapping("/b")
public String onBeverageDTO( Model model)
{
	System.out.println("running Details of on  BeverageDTO");
	
	BeverageDTO dto = new BeverageDTO();
	dto.setApplejuice("fizze");
	dto.setMangojuice("furti");
	dto.setOrengjuice("paperboat");
	dto.setWatermelonjuice("aluofruti");
	dto.setWine("redlips");
	dto.setKivijuice("tropican");
	dto.setSoda("sweet");
	
	model.addAttribute("Applejuice", dto.getApplejuice());	
	model.addAttribute("Mangojuice", dto.getOrengjuice());
	model.addAttribute("Orengjuice", dto.getMangojuice());
	model.addAttribute("Watermelonjuice", dto.getWatermelonjuice());
	model.addAttribute("Wine", dto.getWine());
	model.addAttribute("Kivijuice", dto.getKivijuice());
	model.addAttribute("Soda", dto.getSoda());
	return "index.jsp";
}

@GetMapping("/c")
public String onChatDTO( Model model)
{
	System.out.println("running Details of on  ChatDTO");
	
	ChatDTO dto = new ChatDTO();
	dto.setChat1("Masalapuri");
	dto.setChat2("Gobi");
	dto.setChat3("dahipuri");
	dto.setChat4("savepuri");
	dto.setChat5("panipuri");
	dto.setChat6("vadapav");
	dto.setChat7("belpuri");
	dto.setChat8("breadsandwich");
	dto.setChat9("pizza");
	dto.setChat10("momos");
	dto.setChat11("corn");
	
	model.addAttribute("Chat1", dto.getChat1());	
	model.addAttribute("Chat2", dto.getChat2());
	model.addAttribute("Chat3", dto.getChat3());
	model.addAttribute("Chat4", dto.getChat4());
	model.addAttribute("Chat5", dto.getChat5());
	model.addAttribute("Chat6", dto.getChat6());
	model.addAttribute("Chat7", dto.getChat7());
	model.addAttribute("Chat8", dto.getChat8());
	model.addAttribute("Chat9", dto.getChat9());
	model.addAttribute("Chat10", dto.getChat10());
	model.addAttribute("Chat11", dto.getChat11());
	
	return "index.jsp";
}
}

