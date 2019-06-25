using datapleasework.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Services
{
    public interface ITodoService
    {
        IEnumerable<Todo> findAll();
        Todo findById(long id);
        void deleteById(long id);
        void Update(Todo todo);
        void Add(Todo todo);
    }
}
