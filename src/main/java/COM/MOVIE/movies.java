package COM.MOVIE;

public class movies {
    public int id;
    public String Name;
    public String releaseDate;
    public String actorName;
    public String actressName;

    @Override
    public String toString() {
        return "movies{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", actorName='" + actorName + '\'' +
                ", actressName='" + actressName + '\'' +
                '}';
    }

    public movies(int id, String name, String releaseDate, String actorName, String actressName) {
        this.id = id;
        Name = name;
        this.releaseDate = releaseDate;
        this.actorName = actorName;
        this.actressName = actressName;


    }

}
