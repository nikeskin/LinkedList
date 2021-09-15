package model;

public class LinkedAnimalList {

    public AnimalListItem head;

    public LinkedAnimalList(AnimalListItem item) {
        this.head = item;
    }

    public int getLength() {
        if (head == null) {
            return 0;
        } else {
            int counter = 1;
            AnimalListItem temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
                counter++;
            }
            return counter;
        }
    }

    public void add(AnimalListItem item) {
        if (head == null) {
            head = item;
        } else {
            AnimalListItem temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(item);
        }
    }

    public String printLinkedAnimalNames() {
        StringBuilder sb = new StringBuilder();
        if (head == null) {
            return "No elements to print";
        } else {
            sb.append("Head: " + head.getValue().getName() + " ");
            AnimalListItem temp = head;
            while (temp.getNext() != null) {
                sb.append("--> " + temp.getNext().getValue().getName() + " ");
                temp = temp.getNext();
            }
            sb.append("|");
            return sb.toString();
        }
    }

    public Animal getAnimalAtIndex(int index) {
        if (index == 0) {
            return head.getValue();
        } else if (index > this.getLength()-1) {
            System.out.println("out of range");
            return null;
        } else {
            int count = 1;
            AnimalListItem temp = head;
            while (count <= index) {
                count++;
                temp = temp.getNext();
            }
            return temp.getValue();
        }
    }

    public void addAtIndex(AnimalListItem item, int index) {
        if (index == 0) {
            AnimalListItem newHead = item;
            newHead.setNext(head);
            head = newHead;
        } else if (index > this.getLength() - 1) {
            System.out.println("out of linked list range");
        } else {
            int count = 1;
            AnimalListItem temp = head;
            while (count < index) {
                count++;
                temp = temp.getNext();
            }
            AnimalListItem newItem = item;
            newItem.setNext(temp.getNext());
            temp.setNext(newItem);
        }

    }

    public void remove(Animal item) {
        if ((head != null) && (item != null)) {
            boolean matchFound = false;

            AnimalListItem temp = head;
            while (temp.getNext() != null) {
                if (temp.getNext().getValue().getName() == item.getName()) {
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

            if (head.getValue().getName() == item.getName()) {
                head = head.getNext();
                matchFound = true;
            }

            if (!matchFound) {
                System.out.println("no match found");
            }
        } else if (this.getLength() == 0){
            System.out.println("no elements");
        } else if (item == null) {
            System.out.println("Invalid animal entered");
        }

    }

    @Override
    public String toString() {
        return "LinkedAnimalList{" +
                "head=" + head +
                '}';
    }
}
