package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ZenkiHukuController {

		@RequestMapping(path = "/zenkihuku", method = RequestMethod.GET)
		public String viewPage() {
			// 表示するHTMLはreturnの後ろに書く。
			// 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
			return "zenki";
		}
		
		@RequestMapping(path = "/zenkihuku2", method = RequestMethod.GET)
		public String viewPage2() {
			// 表示するHTMLはreturnの後ろに書く。
			// 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
			return "zenki2";
		}
	}

