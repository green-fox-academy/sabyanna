using datapleasework.Models;
using Microsoft.AspNetCore.Mvc.Rendering;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.ViewModels
{
    public class MyViewModel
    {

        public Todo Todo { get; set; }
        public List<SelectListItem> Assignees { get; set; }
        public long AssigneeId { get; set; }

        public MyViewModel(Todo todo, IEnumerable<Assignee> Assignees)
        {
            this.Todo = Todo;
            this.AssigneeId = Todo.Assignee.AssId;
            this.Assignees = Assignees.Select(x => new SelectListItem(x.AssigneeName, x.AssId.ToString()))
                .ToList();
        }




    }
}
