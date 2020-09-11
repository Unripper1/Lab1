package LAB3;

public abstract class Dog {
    protected String name;
    public void setName(String name){
        this.name=name;
    };
    public abstract void showName();
}
class Bulldog extends Dog{
    public void showName() {
        System.out.println(name);
    }

}
class Husky extends Dog{
    public void showName() {
        System.out.println(name);
    }


}

class Pug extends Dog{
    public void showName() {
        System.out.println(name);
    }


}
class Main3 {
    public static void main(String[] args){
        Dog husky = new Husky();
        husky.setName("SK");
        husky.showName();
    }
}