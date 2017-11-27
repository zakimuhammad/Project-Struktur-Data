package info_takjil;
// =====BISMILLAH=====

public class SortedList {

    public Link first;

    public SortedList() {
        first = null;
    }

    public void insert(Link theLink) {
        int key = theLink.getKey();

        Link previous = null;
        Link current = first;
        while (current != null && key > current.getKey()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = theLink;
        } else {
            previous.next = theLink;
        }
        theLink.next = current;
    }

    public Link find(int key) {
        Link current = first;
        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        System.out.println(key + " tidak ketemu");
        return null;
    }

    public Link displaymasjid() {
        Link current = first;
        while (current != null) {
            System.out.println(current.getMasjid() + "\n" + current.getAlamat());
            current = current.next;
        }
        System.out.println("");
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
// =====ALHAMDULILLAH=====