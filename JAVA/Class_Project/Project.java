public class Project {
    private String name;
    private String description;
    
    public String elevatorPitch() {
        return name + ": " + description;
    }

    public Project() {
        System.out.println("Proyecto sin nombre o descripción.");
    }

    public Project(String name) {
        this.name = name;
        System.out.println("El nombre de este proyecto es " + name);
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        System.out.println("Proyecto de " + name + " creado.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("El nombre de este proyecto ha cambiado a " + name);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description =  description;
        System.out.println("La descripción de este proyecto ha cambiado a: " + description);
    }
}