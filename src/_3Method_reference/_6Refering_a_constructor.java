package _3Method_reference;

@FunctionalInterface
interface Messageable{
    void getmessage();
}

class Message{
    Message()
    {
        System.out.println("referring a constructor");
    }
}


public class _6Refering_a_constructor {
    public static void main(String args[]) {
        Messageable m = Message::new; //class_name::new;
        m.getmessage();
    }
}
