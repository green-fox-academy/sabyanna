using datapleasework.Data;
using datapleasework.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Services
{
    public class AssigneeService : IAssigneeService
    {
        private readonly ApplicationContext applicationContext;
        public AssigneeService(ApplicationContext applicationContext)
        {
            this.applicationContext = applicationContext;
        }

        public List<Assignee> findAll()
        {
            return applicationContext.Assignees.ToList();
        }

        public void deleteById(long id)
        {
            var assignee = applicationContext.Assignees.Find(id);
            applicationContext.Remove(assignee);
            applicationContext.SaveChanges();
        }


        public Assignee findById(long id)
        {
            return applicationContext.Assignees.SingleOrDefault(assignee => assignee.AssId == id);
        }

        public void Add(Assignee assignee)
        {
            applicationContext.Add(assignee);
            applicationContext.SaveChanges();
        }

        public void Update(Assignee assignee)
        {
            applicationContext.Update(assignee);
            applicationContext.SaveChanges();
        }
    }
}
