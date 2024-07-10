class Demo{
    public static void main(String []args){

    CircularLinkedList<String> list=new CircularLinkedList<String>();
    
    list.insertAtBeginning("Bismllah");
    list.insertAtBeginning("Bismilla");
     
    list.deleteAtBeginning();
    list.deleteAtEnd();
    list.insertAtBeginning("Bismilla rahmanirrahim");

    list.display();
}}
