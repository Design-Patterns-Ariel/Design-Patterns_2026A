package Week04.Observer;


public class Student extends Person implements IObserver, NotificationObserver {


    public Student(String name, String last_name, float age, String id, char gender, String phone, String email) {
        super(name, last_name, age, id, gender, phone, email);
    }

    @Override
    public void sendMsgWithSms(String msg) {
        System.out.println("Send sms  -> msg: " + msg + " " + getName() + " to: " + getPhone());
    }

    @Override
    public void sendMsgWithEmail(String msg) {
        System.out.println("Send Email -> msg: " + msg + " " + getName() + " to: " + getEmail());
    }

    @Override
    public void sendMsg(String msg) {
        sendMsgWithEmail(msg);
        sendMsgWithSms(msg);
    }

    @Override
    public void update(String msg) {
        System.out.println(super.print() + " -> " + msg);
    }


}