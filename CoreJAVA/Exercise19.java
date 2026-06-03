
    interface playable{
        public void play();
    }

    class guitar implements playable{
        public void play(){
            System.out.println("Guitar playing");
        }
    }

    class piano implements playable{
        public void play(){
            System.out.println("Piano playing");
        }
    }

public class Exercise19 {
    public static void main(String[] args) {
        guitar g = new guitar();
        piano p = new piano();
        g.play();
        p.play();
    }
}
