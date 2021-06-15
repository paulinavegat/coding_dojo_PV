public class ProjectTest {
    public static void main(String[] args) {
        System.out.println("Creando un proyecto de prueba:");//proyecto vacío
        Project proj = new Project();
        System.out.println("Nombre: " + proj.getName()); // proyecto sin nombre, devuelve null.
        System.out.println("Descripción: " + proj.getDescription()); //proyecto sin descripción, devuelve null.
        proj.setName("Talento Digital");
        proj.setDescription("Es la única iniciativa país que desarrolla nuevas capacidades en las personas, en sintonía con las demandas de la economía digital.");
        System.out.println(proj.elevatorPitch());
        System.out.println("");

        System.out.println("Creando un proyecto con nombre pero sin descripción:");
        Project namedProj = new Project("Balloon");
        System.out.println("Nombre: " + namedProj.getName());
        System.out.println("Descripción: " + namedProj.getDescription());
        namedProj.setDescription("Empresa social que a través de la acción, vinculación y gestión del conocimiento impactamos positivamente en los territorios y en las comunidades de agentes de cambio..");
        System.out.println(namedProj.elevatorPitch());
        System.out.println("");

        System.out.println("Creando un proyecto con nombre y descripción:");
        Project goodProj = new Project("Girls in Tech, Chile", "personas de diferentes orígenes que comparten su deseo de ver la evolución de la tecnología.");
        System.out.println("Nombre: " + goodProj.getName());
        System.out.println("Descripción: " + goodProj.getDescription());
        System.out.println(goodProj.elevatorPitch());
    }
}