public class Sonnect29 implements Poem {
private  static String[] LINES={
        "When, in disgrace with fortune and men' s eyes,","I all alone beweep my outcast state","And trouble deaf heaven with my bootless cries", "And look upon myself and curse my fate,", "Wishing me like to one more rich in hope,", "Featured like him, like him with friends possess' d,", "Desiring this man' s art and that man' s scope,", "With what I most enjoy contented least;"
};
public  Sonnect29(){

}
public  void recite(){
    for(int i=0;i<LINES.length;i++){
        System.out.println(LINES[i]);
    }
}
}
