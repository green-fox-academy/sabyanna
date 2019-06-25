using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace MockTestApp.Services
{
    public class HelloService : IHelloService
    {
        public string HelloWorld()
        {
            return "Hello World!";
        }
    }
}
