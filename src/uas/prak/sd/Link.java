package uas.prak.sd;
// =====BISMILLAH=====

import java.io.*;

public class Link {

    private int iData; // data item
    private String masjid;
    public Link next; // next link in list

    public Link(int iData, String masjid) // constructor
    {
        this.iData = iData;
        this.masjid = masjid;
    }

    public int getKey() {
        return iData;
    }

    public String getData() {
        return masjid;
    }

    public void displayLink() // display this link
    {
        System.out.print(iData + " " + masjid + " | ");
    }
} // end class Link

class SortedList {

    private Link first; // ref to first list item

    public SortedList() // constructor
    {
        first = null;
    }

    public void insert(Link theLink) // insert link, in order
    {
        int key = theLink.getKey();

        Link previous = null; // start at first
        Link current = first;
        // until end of list,
        while (current != null && key > current.getKey()) { // or current > key,
            previous = current;
            current = current.next; // go to next item
        }
        if (previous == null) // if beginning of list,
        {
            first = theLink; // first --> new link
        } else // not at beginning,
        {
            previous.next = theLink; // prev --> new link
        }
        theLink.next = current; // new link --> current
    } // end insert()

    public void delete(int key) // delete link
    { // (assumes non-empty list)
        Link previous = null; // start at first
        Link current = first;
        // until end of list,
        while (current != null && key != current.getKey()) { // or key == current,
            previous = current;
            current = current.next; // go to next link
        }
        // disconnect link
        if (previous == null) // if beginning of list
        {
            first = first.next; // delete first link
        } else // not at beginning
        {
            previous.next = current.next;
        }
    } // end delete()

    public Link find(int key) // find link
    {
        Link current = first; // start at first
        // until end of list,
        while (current != null && current.getKey() <= key) { // or key too small,
            if (current.getKey() == key) // is this the link?
            {
                return current; // found it, return link
            }

            current = current.next; // go to next item
        }
        return null; // didn’t find it
    } // end find()

    public Link displaymasjid() {
        Link current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }
        System.out.println("");
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first; // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
} // end class SortedList

class hashtable {

    private SortedList[] hashArray; // array of lists
    private int size;

    public hashtable(int size) // constructor
    {
        this.size = size;
        hashArray = new SortedList[size]; // create array
        for (int j = 0; j < size; j++) // fill array
        {
            hashArray[j] = new SortedList(); // with lists
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) // for each cell,
        {
            System.out.print(" " + j + ". "); // display cell number
            hashArray[j].displayList(); // display list
        }
    }

    public int hashFunc(int key) // hash function
    {
        return key % size;
    }

    public void insert(int data, String masjid) // insert a link
    {
        Link theLink = new Link(data, masjid);
        int key = theLink.getKey();
        int hashVal = hashFunc(key); // hash the key
        hashArray[hashVal].insert(theLink); // insert at hashVal
    } // end insert()

    public void delete(int key) // delete a link
    {
        int hashVal = hashFunc(key); // hash the key
        hashArray[hashVal].delete(key); // delete link
    } // end delete()

    public Link find(int key) // find link
    {
        System.out.println("cari: " + key);
        int hashVal = hashFunc(key); // hash the key
        Link theLink = hashArray[hashVal].find(key); // get link
        System.out.println(hashArray[hashVal].displaymasjid());
        return theLink; // return link
    }
} // end class HashTable

class HashChainApp {

    public static void main(String[] args) throws IOException {
        int size = 30;
        hashtable hash;
        hash = new hashtable(size);
        hash.insert(1, "masjid A");
        hash.insert(1, "masjid F");
        hash.insert(1, "masjid G");
        hash.insert(5, "masjid B");
        hash.insert(29, "masjid C");
        hash.insert(20, "masjid H");
        hash.insert(20, "masjid J");
        hash.insert(20, "masjid K");
        hash.insert(20, "masjid L");
        hash.insert(15, "masjid E");
        hash.find(1);
        hash.find(20);
        hash.displayTable();
    }
}
// =====ALHAMDULILLAH=====
