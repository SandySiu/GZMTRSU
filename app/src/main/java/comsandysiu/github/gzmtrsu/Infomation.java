package comsandysiu.github.gzmtrsu;

/**
 * Created by Sandy on 2017/11/5.
 */

public class Infomation {
    private String mStatue;
    private String mLine;
    private String mDate;

    public Infomation(String statue,String line,String date){
        this.mStatue = statue;
        this.mLine = line;
        this.mDate = date;
    }

    public void setmStatue(String Statue) {
        this.mStatue = Statue;
    }

    public String getmStatue(){
        return mStatue;
    }

    public void setmLine(String line) {
        this.mLine = line;
    }

    public String getmLine(){
        return mLine;
    }

    public void setmDate(String date) {
        this.mDate = date;
    }

    public String getmDate(){
        return mDate;
    }

}
