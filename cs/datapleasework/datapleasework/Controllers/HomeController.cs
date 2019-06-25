using datapleasework.Models;
using datapleasework.Services;
using datapleasework.ViewModels;
using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Controllers
{
    public class HomeController : Controller
    {
        private readonly ITodoService todoService;
        private readonly IAssigneeService assigneeService;

        public HomeController(ITodoService todoService, IAssigneeService assigneeService)
        {
            this.todoService = todoService;
            this.assigneeService = assigneeService;
            //todoService.Add(new Todo("eat"));
            //todoService.Add(new Todo("sleep"));
            //todoService.Add(new Todo("walk"));
            //todoService.Add(new Todo("hide"));
        }
  

        [HttpGet("/")]
        public IActionResult Index()
        {
            var todos = todoService.findAll();
            return View(todos);
        }

        [HttpGet("/Add")]
        public IActionResult Add()
        {
            return View();
        }

        [HttpPost("/Add")]
        public IActionResult Add(Todo todo)
        {
            todoService.Add(todo);
            return RedirectToAction("Index", "Home");
        }

        [HttpPost("/Home/EditTodo")]
        public IActionResult EditTodo(long id)
        {
            var assigneeList = assigneeService.findAll();
            var todoIns = todoService.findById(id);

            var myViewModel = new MyViewModel(todoIns, assigneeList);


            return View(myViewModel);
        }

        [HttpPost("/Home")]
        public IActionResult EditTodo(Todo todo, long id)
        {
            //Todo todo = myViewModel.todo;
            //todo.Id = id;


            todo.Id = id;


            todoService.Update(todo);

            return RedirectToAction("Index", "Home");
        }


    }
}
