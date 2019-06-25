using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using MyFirstWebApp.Models;

namespace MyFirstWebApp.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet("/")]
        public IActionResult Index(int id)
        {

            Contact contact = new Contact()
            {
                id = id,
                FirstName = "Anna",
                LastName = "Saby"
            };
            
            return View(contact);
        }
    }
}
