package model;

public class LinkedAnimalList {

    public AnimalListItem head;

    public LinkedAnimalList(AnimalListItem item) {
        this.head = item;
    }

    public int getLength(){
        int counter = 1;
        AnimalListItem temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            counter++;
        }
        return counter;
    }

    public void add(AnimalListItem item) {
        AnimalListItem temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(item);
    }

    public void remove(Animal item) {

        boolean matchFound = false;

        AnimalListItem temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getValue().getValue() == item.getValue()) {
                if (temp.getNext().getNext() != null) {
                    temp.setNext(temp.getNext().getNext());
                } else {
                    temp.setNext(null);
                }
                matchFound = true;
            }
            if (temp.getNext() == null) {
                break;
            } else {
                temp = temp.getNext();
            }
        }

        if (head.getValue().getValue() == item.getValue()) {
            head = head.getNext();
            matchFound = true;
        }

        if (!matchFound) {
            System.out.println("no match found");
        }
    }

    @Override
    public String toString() {
        return "LinkedAnimalList{" +
                "head=" + head +
                '}';
    }
}
