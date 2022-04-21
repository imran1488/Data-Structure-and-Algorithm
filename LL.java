class LL {
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

        newNode.next = head;
        head = newNode;
    }

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
        LL list = new LL();

        System.out.println(list.head);

    }

}
