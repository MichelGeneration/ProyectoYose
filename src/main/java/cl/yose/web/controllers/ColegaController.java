package cl.yose.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ColegaController {

	//https://localhost:8080/
		@RequestMapping("/")
		public String getColega() {
			System.out.println("metodo de obtener usuario");
			return "index.jsp";
		}
		//https://localhost:8080/home
		@RequestMapping("/home2")
		public String home2() {
			System.out.println("En el metodo home");
			return "home2";
		}
		@RequestMapping("/michel/espinoza")
		public String mespinoza() {
			System.out.println("En el metodo michel");
			return "";
		}
	}

