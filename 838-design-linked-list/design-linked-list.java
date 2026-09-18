// class MyLinkedList {
//     class Node{
//         int data;
//         Node next;
//         Node(int d){
//             this.data=d;
//             this.next=null;
//         }
//     }
//     Node head;
//     int size;

//     public MyLinkedList() {
//         head=null;
//         size=0;
//     }
    
//     public int get(int index) {
//         if(index<0||index>=size){
//             return -1;
//         }
//         Node temp=head;
//         for(int i=0;i<index;i++){
//             temp=temp.next;
//         }
//         return temp.data;
//     }
    
//     public void addAtHead(int val) {
//         Node temp=new Node(val);
//         temp.next=head;
//         head=temp;
//         size++;
//     }
    
//     public void addAtTail(int val) {
//         Node newn=new Node(val);
//         if(head==null){
//             head=newn;
//             size++;
//             return;
//         }
//         Node temp=head;
//         while(temp.next!=null){
//             temp=temp.next;
//         }
//         temp.next=newn;
//         size++;
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index<0||index>=size) return;
//         if(index==0){
//             addAtHead(val);
//             return;
//         }
//         if(index==size) {
//             addAtTail(val);
//             return;
//         }
//         Node temp=head;
//         for(int i=0;i<index-1;i++){
//             temp=temp.next;
//         }
//         Node newn=new Node(val);
//         newn.next=temp.next;
//         temp.next = newn;
//         size++;
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0||index>size) return;
//         if(index==0){
//             head=head.next;
//             size--;
//             return;
//         }
//         Node temp=head;
//         for(int i=0;i<index-1;i++){
//             temp=temp.next;
//         }
//         temp.next=temp.next.next;
//         size--;
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */
class MyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        size++;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }
}