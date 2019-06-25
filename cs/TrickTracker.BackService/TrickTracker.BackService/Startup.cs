using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.HttpsPolicy;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using Microsoft.Extensions.Options;
using TrickTracker.BackService.Data;

namespace TrickTracker.BackService
{
    public class Startup
    {
        public IConfiguration Configuration { get; set;  }
        public Startup(IConfiguration configuration)
        {
            Configuration = configuration;

            //var builder = new ConfigurationBuilder()
            //    .SetBasePath(env.ContentRootPath)
            //    .AddJsonFile("appsettings.json", optional: false, reloadOnChange: true)
            //    .AddJsonFile($"appsettings.{env.EnvironmentName}.json, optional: true")
            //    .AddEnvironmentVariables();
            //Configuration = builder.Build();

            //var environment = Configuration["ApplicationSettings:Environment"];
        }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {

            using (var context = new TripContext())
            {
                context.Database.EnsureCreated();
            }
            services.AddTransient<Models.Repository>();
            services.AddMvc().SetCompatibilityVersion(CompatibilityVersion.Version_2_1);

            //services.AddSwaggerGen(options =>
            //    options.SwaggerDoc("v1", new Swashbuckle.AspNetCore.Swagger.Info { Title = "Trip Tracker", Version = "v1" })
            //);
        }   

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env)
        {
            //app.UseSwagger();

            //app.UseSwaggerUI(options =>
            //    options.SwaggerEndpoint("/swagger/v1/swagger.json", "Trip Tracker v1")
            //);

            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
            }
            else
            {
                app.UseHsts();
            }

            app.UseHttpsRedirection();

            app.UseMvc();
        }
    }
}
