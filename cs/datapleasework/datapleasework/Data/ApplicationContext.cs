using datapleasework.Models;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace datapleasework.Data
{
    public class ApplicationContext : DbContext
    {
        public DbSet<Todo> Todos { get; set; }
        public DbSet<Assignee> Assignees { get; set; }

        public ApplicationContext(DbContextOptions options) : base(options)
        {

        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Todo>().Property(p => p.Id).ValueGeneratedOnAdd();

            modelBuilder.Entity<Todo>().Property(r => r.IsUrgent).HasConversion<short>();

            modelBuilder.Entity<Todo>().Property(q => q.IsDone).HasConversion<short>();




            //protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
            //{

            //}
        }
    }
}
