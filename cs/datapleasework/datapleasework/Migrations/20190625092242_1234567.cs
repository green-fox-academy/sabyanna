using Microsoft.EntityFrameworkCore.Migrations;

namespace datapleasework.Migrations
{
    public partial class _1234567 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.CreateTable(
                name: "Assignees",
                columns: table => new
                {
                    AssId = table.Column<long>(nullable: false)
                        .Annotation("MySQL:AutoIncrement", true),
                    AssigneeName = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Assignees", x => x.AssId);
                });

            migrationBuilder.CreateTable(
                name: "Todos",
                columns: table => new
                {
                    Id = table.Column<long>(nullable: false)
                        .Annotation("MySQL:AutoIncrement", true),
                    Title = table.Column<string>(nullable: true),
                    IsUrgent = table.Column<short>(nullable: false),
                    IsDone = table.Column<short>(nullable: false),
                    AssigneeAssId = table.Column<long>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Todos", x => x.Id);
                    table.ForeignKey(
                        name: "FK_Todos_Assignees_AssigneeAssId",
                        column: x => x.AssigneeAssId,
                        principalTable: "Assignees",
                        principalColumn: "AssId",
                        onDelete: ReferentialAction.Restrict);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Todos_AssigneeAssId",
                table: "Todos",
                column: "AssigneeAssId");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropTable(
                name: "Todos");

            migrationBuilder.DropTable(
                name: "Assignees");
        }
    }
}
