using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Models
{
    public class Assignee
    {
        [Key]
        public long AssId { get; set; }

        public List<Todo> TodoList { get; set; }
        public string AssigneeName { get; set; }

    }
}
