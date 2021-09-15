import model.Animal;
import model.AnimalListItem;
import model.LinkedAnimalList;

public class Main {

    public static void main(String[] args) {
        Animal chicken = new Animal("Chicken");
        Animal lion = new Animal("Lion");
        Animal mouse = new Animal("Mouse");
        Animal chicken2 = new Animal("Chicken");

        AnimalListItem chickenItem = new AnimalListItem(chicken);
        AnimalListItem lionItem = new AnimalListItem(lion);
        AnimalListItem mouseItem = new AnimalListItem(mouse);
        AnimalListItem chickenItem2 = new AnimalListItem(chicken2);

        LinkedAnimalList linkedAnimalList = new LinkedAnimalList(chickenItem);
        System.out.println(linkedAnimalList);

        linkedAnimalList.add(lionItem);
        System.out.println(linkedAnimalList);

        linkedAnimalList.addAtIndex(mouseItem, 1);
        System.out.println(linkedAnimalList);

        System.out.println(linkedAnimalList.printLinkedAnimalNames());

        linkedAnimalList.add(chickenItem2);
        System.out.println(linkedAnimalList);
        System.out.println(linkedAnimalList.getLength());

        linkedAnimalList.remove(chicken);
        linkedAnimalList.remove(mouse);
        linkedAnimalList.remove(null);
        linkedAnimalList.remove(lion);
        System.out.println(linkedAnimalList);
        System.out.println(linkedAnimalList.getLength());

        System.out.println(linkedAnimalList.printLinkedAnimalNames());

    }
}
