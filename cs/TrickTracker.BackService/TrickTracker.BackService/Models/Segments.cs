using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TrickTracker.BackService.Models
{
    public class Segments
    {
        public int Id { get; set; }
        public int TripId { get; set; }

        public String Name { get; set; }
        public String Description { get; set; }
        public DateTimeOffset StartDateTime { get; set; }
        public DateTimeOffset EndDateTime { get; set; }

    }
}
