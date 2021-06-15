public class ProjectTest {
    public static void main(String[] args) {
        System.out.println("Creando un proyecto de prueba:");//proyecto vac�o
        Project proj = new Project();
        System.out.println("Nombre: " + proj.getName()); // proyecto sin nombre, devuelve null.
        System.out.println("Descripci�n: " + proj.getDescription()); //proyecto sin descripci�n, devuelve null.
        proj.setName("Talento Digital");
        proj.setDescription("Es la �nica iniciativa pa�s que desarrolla nuevas capacidades en las personas, en sinton�a con las demandas de la econom�a digital.");
        System.out.println(proj.elevatorPitch());
        System.out.println("");

        System.out.println("Creando un proyecto con nombre pero sin descripci�n:");
        Project namedProj = new Project("Balloon");
        System.out.println("Nombre: " + namedProj.getName());
        System.out.println("Descripci�n: " + namedProj.getDescription());
        namedProj.setDescription("Empresa social que a trav�s de la acci�n, vinculaci�n y gesti�n del conocimiento impactamos positivamente en los territorios y en las comunidades de agentes de cambio..");
        System.out.println(namedProj.elevatorPitch());
        System.out.println("");

        System.out.println("Creando un proyecto con nombre y descripci�n:");
        Project goodProj = new Project("Girls in Tech, Chile", "personas de diferentes or�genes que comparten su deseo de ver la evoluci�n de la tecnolog�a.");
        System.out.println("Nombre: " + goodProj.getName());
        System.out.println("Descripci�n: " + goodProj.getDescription());
        System.out.println(goodProj.elevatorPitch());
    }
}