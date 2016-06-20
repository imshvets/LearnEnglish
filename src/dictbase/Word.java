package dictbase;

/**
 * Created by Oleg on 20.06.2016.
 */
public class Word {
    private long id;

    private String english;
    private String ukrainian;

    public Word() {}

    public Word(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getUkrainian() {
        return ukrainian;
    }

    public void setUkrainian(String ukrainian) {
        this.ukrainian = ukrainian;
    }
}
