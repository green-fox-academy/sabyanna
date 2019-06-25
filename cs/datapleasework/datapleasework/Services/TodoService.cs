using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using datapleasework.Data;
using datapleasework.Models;

namespace datapleasework.Services
{
    public class TodoService : ITodoService
    {
        private readonly ApplicationContext applicationContext;
        public TodoService(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
            //Todo myTodo = new Todo
            //{
            //    //Title = "sleep",
            //    //IsUrgent = false,
            //    //IsDone = false

            //};
            //applicationContext.Todos.Add(myTodo);

        }

        public IEnumerable<Todo> findAll()
        {
            return applicationContext.Todos.ToList();
        }

        public void deleteById(long id)
        {
            var todo = applicationContext.Todos.Find(id);
            applicationContext.Remove(todo);
            applicationContext.SaveChanges();
        }


        public Todo findById(long id)
        {
            return applicationContext.Todos.SingleOrDefault(todo => todo.Id == id);
        }

        public void Add(Todo todo)
        {
            applicationContext.Add(todo);
            applicationContext.SaveChanges();
        }

        public void Update(Todo todo)
        {
            applicationContext.Update(todo);
            applicationContext.SaveChanges();
        }
    }
}
