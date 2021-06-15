public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        if(this.head == null){
            this.head = new Node(value);
        }
        else{
            Node pointer = this.head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = new Node(value);
        }
    }
    // Va hasta el último nodo y agrega uno nuevo al valor dado
    // Si no hay "head", esto crea un nuevo nodo con el valor dado y lo hace "head"

    public void remove(){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next.next != null){
                pointer = pointer.next;
            }
            pointer.next = null;
        }
    }
    // Va hasta el penultimo nodo y luego cambia su propiedad ".nodo" a null, deshaciendose del nodo final
    public void printValues(){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                System.out.println(pointer.value);
                pointer = pointer.next;
            }
        }
    }
    // Imprime cada valor en singly linked list

    public Node find(int value){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                if(pointer.value == value){
                    return pointer;
                }
                pointer = pointer.next;
            }
        }
        return this.head;
    }
    // Encuentra el primer nodo en la lista con el valor dado y lo devuelve
    // De otra forma, devolvería "head"

    public void removeAt(int index){
        if(this.head != null){
            int count = 0;
            Node pointer = this.head;
            Node temp = null;
            while(pointer.next != null){
                if(count == index){
                    temp.next = temp.next.next;
                    break;
                }
                temp = pointer;
                pointer = pointer.next;
                count++;
            }
        }
    }
    // Remueve nodo al indice dado (0 es el primero)
}