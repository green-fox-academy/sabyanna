using datapleasework.Models;
using datapleasework.Services;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Controllers
{
    public class AssigneeController : Controller
    {

        private readonly IAssigneeService assigneeService;

        public AssigneeController(IAssigneeService assigneeService)
        {
            this.assigneeService = assigneeService;

        }

        [HttpGet("/Assignees")]
        public IActionResult Index()
        {
            var assignees = assigneeService.findAll();
            return View(assignees);
        }

        [HttpGet("/AddAssignee")]
        public IActionResult AddAssignee()
        {
            return View();
        }

        [HttpPost("/AddAssignee")]
        public IActionResult AddAssignee(Assignee assignee)
        {
            assigneeService.Add(assignee);
            return RedirectToAction("Index", "Assignee");
        }

        [HttpPost("/EditASsignee")]
        public IActionResult EditAssignee(long id)
        {
            var assignee = assigneeService.findById(id);

            return View(assignee);
        }

        [HttpPost("/EditedAssigne")]
        public IActionResult EditedAssigne(Assignee assignee, long id)
        {
            assignee.AssId = id;
            assigneeService.Update(assignee);

            return RedirectToAction("Index", "Assignee");
        }



    }
}
