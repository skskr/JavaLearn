package basetrain01;

public class Demo {
    public static void main(String[] args) {
        PingpongPlayer pp = new PingpongPlayer("pp1", 10);
        PingpongTrainer pt = new PingpongTrainer("pt1", 30);
        BasketballPlayer bp = new BasketballPlayer("bp1", 12);
        BasketballTrainer bt = new BasketballTrainer("bt1", 29);

        pp.eat();
        pp.learn();
        pp.speak();
        pt.eat();
        pt.teach();
        pt.speak();
        bp.eat();
        bp.learn();
        bt.eat();
        bt.teach();
    }
}
