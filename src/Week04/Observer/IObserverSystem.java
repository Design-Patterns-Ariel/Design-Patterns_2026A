package Week04.Observer;

public interface IObserverSystem {

    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyMsg(int mode,String msg);

}
