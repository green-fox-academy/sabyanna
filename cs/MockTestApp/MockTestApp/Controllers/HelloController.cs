using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MockTestApp.Controllers
{
    [Route("api")]
    public class HelloController : Controller
    {
        private readonly IHelloService helloService;

        public HelloController(IHelloService helloService)
        {
            this.helloService = helloService;
        }

        [HttpGet("hello")]
        public IActionResult HelloWorld()
        {
            return Ok(helloService.HelloWorld());
        }
    }
}
