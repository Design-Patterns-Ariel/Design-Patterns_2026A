package Week04.Observer;

public interface IObserver {

    void sendMsgWithSms(String msg);
    void sendMsgWithEmail(String msg);
    void sendMsg(String msg);

}
