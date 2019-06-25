using datapleasework.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Services
{
    public interface IAssigneeService
    {
        List<Assignee> findAll();
        Assignee findById(long id);
        void deleteById(long id);
        void Update(Assignee assignee);
        void Add(Assignee assignee);
    }
}
