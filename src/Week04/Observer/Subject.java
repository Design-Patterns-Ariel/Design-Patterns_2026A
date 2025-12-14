package Week04.Observer;

import java.util.LinkedList;
import java.util.List;


/**
 * sdsds
 * sdsds
 * @param ssss
 *
 */
public class Subject {

    private List<Observer> observers;
    private int state;


    public Subject() {
        observers= new LinkedList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        this.observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:this.observers) {
            observer.update();
        }

    }


}

abstract class Observer{

    protected Subject subject;
    public abstract void update();

}

class BinaryObserver extends Observer{



    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "+ Integer.toBinaryString(subject.getState()));
    }
}

class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+ Integer.toOctalString(subject.getState()));

    }
}

class HexObserver extends Observer{

    public HexObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "+ Integer.toHexString(subject.getState()).toUpperCase());
    }
}