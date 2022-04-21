class LinkedLists {
    Node1 head;

    class Node1 {
        String data;
        Node1 next;

        Node1(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add- First,last
    public void addFirst(String data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add- Last
    public void addLast(String data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 currNode = head;
        while (currNode != null) {
            currNode.next = currNode;
        }
        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        Node1 currNode = head;
        while (currNode != null) {

            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;

        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

    }

}
