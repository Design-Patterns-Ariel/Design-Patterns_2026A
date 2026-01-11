package Week09;

public class A implements Cloneable {

    public A() {
    }

    public A(A other) {
    }

    public void f(){
        System.out.println("public class A");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new A(this);
    }
}

class B extends A {
    public B() {
    }

    public B(B other) {
    }
    public void f(){
        System.out.println("class B extends A");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new B(this);
    }
}

class C extends B {

    public C() {
    }

    public C(C other) {
    }
    public void f(){
        System.out.println("class C extends B");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new C(this);
    }
}

class D extends C {
    public D() {
    }

    public D(D other) {
    }
    public void f(){
        System.out.println("class D extends C");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new D(this);
    }
}

class E extends D {
    public E() {
    }
    public E(E other) {
    }
    public void f(){
        System.out.println("class E extends D ");
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new E(this);
    }
}