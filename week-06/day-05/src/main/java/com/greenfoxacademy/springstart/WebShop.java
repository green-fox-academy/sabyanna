package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebShop {

  List<ShopItem> shopItemList;

  public WebShop() {
    shopItemList.add(new ShopItem("Running shoes", "Nice to run in", 1000, 5));
    shopItemList.add(new ShopItem("Printer", "Nice HP printer", 3000, 2));
    shopItemList.add(new ShopItem("Coca cola", "0,5l drink", 25, 0));
    shopItemList.add(new ShopItem("Wokin", "Delicioso food", 119, 100));
    shopItemList.add(new ShopItem("T-shirt", "Blue with corgi", 300, 1));
  }



  @RequestMapping("/web/webShop")
  public String webPage(Model model) {
    model.addAttribute("items", shopItemList);
    return "table";
  }
}
