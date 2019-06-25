using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TrickTracker.BackService.Models;

namespace TrickTracker.BackService.Data
{
    public class TripContext : DbContext
    {
        public DbSet<Trip> Trips { get; set; }

        public TripContext()
        {

        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            base.OnConfiguring(optionsBuilder);
            optionsBuilder.UseSqlServer("Server=localhost;Database=tripTracker;Trusted_Connection=True;MultipleActiveResultSets=true");
        }
          
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
        }
            
    }
}
