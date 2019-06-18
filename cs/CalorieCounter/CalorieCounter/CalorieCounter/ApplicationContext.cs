using JetBrains.Annotations;
using Microsoft.EntityFrameworkCore;


namespace CalorieCounter
{
    public class ApplicationContext : DbContext
    {
        public ApplicationContext (DbContextOptions options) : base(options)
        {
        }
    }
}
