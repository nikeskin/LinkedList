import model.Animal;
import model.AnimalListItem;
import model.LinkedAnimalList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedAnimalListTest {

    @Test
    public void runLinkedListTest() {
        //GIVEN
        Animal chicken = new Animal("Chicken");
        Animal lion = new Animal("Lion");
        Animal mouse = new Animal("Mouse");
        Animal chicken2 = new Animal("Chicken");

        AnimalListItem chickenItem = new AnimalListItem(chicken);
        AnimalListItem lionItem = new AnimalListItem(lion);
        AnimalListItem mouseItem = new AnimalListItem(mouse);
        AnimalListItem chickenItem2 = new AnimalListItem(chicken2);

        String expected = "LinkedAnimalList{head=AnimalListItem{value=Animal{animalName='Chicken'}, next=AnimalListItem{value=Animal{animalName='Lion'}, next=AnimalListItem{value=Animal{animalName='Mouse'}, next=AnimalListItem{value=Animal{animalName='Chicken'}, next=null}}}}}";

        //WHEN
        LinkedAnimalList actual = new LinkedAnimalList(chickenItem);
        actual.add(lionItem);
        actual.add(mouseItem);
        actual.add(chickenItem2);

        //THEN
        Assertions.assertEquals(expected, actual.toString());
    }

    @Test
    public void runLinkedListTestForLength1() {
        //GIVEN
        Animal chicken = new Animal("Chicken");
        AnimalListItem chickenItem = new AnimalListItem(chicken);
        int expected = 1;

        //WHEN
        LinkedAnimalList linkedList = new LinkedAnimalList(chickenItem);
        int actual = linkedList.getLength();
        //THEN
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void runLinkedListTestForLength3() {
        //GIVEN
        Animal chicken = new Animal("Chicken");
        Animal lion = new Animal("Lion");
        Animal mouse = new Animal("Mouse");

        AnimalListItem chickenItem = new AnimalListItem(chicken);
        AnimalListItem lionItem = new AnimalListItem(lion);
        AnimalListItem mouseItem = new AnimalListItem(mouse);

        int expected = 3;

        //WHEN
        LinkedAnimalList linkedList = new LinkedAnimalList(chickenItem);
        linkedList.add(lionItem);
        linkedList.add(mouseItem);
        int actual = linkedList.getLength();

        //THEN
        Assertions.assertEquals(expected, actual);
    }

}
