public class Instrumentlist implements Performer {
    private String song;
    private Instrument instrument;

    public   Instrumentlist(){
    }
    public void  perform() throws PerformanceException{
        System.out.print("Playing" + song + ":");
instrument.play();
    }

    public  void setSong(String song){
        this.song=song;
    }
    public String getSong(){
        return song;
    }
    public String screamSong(){
        return song;
    }
    public void setInstrument(Instrument instrument){
        this.instrument=instrument;
    }
}

