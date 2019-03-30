public class Instrumentlist implements Performer {
    private String song;

    public   Instrumentlist(){
    }
    public void  perform() throws PerformanceException{
        System.out.print("Playing" + song + ":");

    }
}

