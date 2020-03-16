package pojos;

public class Song  implements java.io.Serializable {

    private Integer id;
    private String name;
    private String album;
    private String genre;
    private Integer artistId;

    public Song() {

    }

    public Song(String name, String album) {

        this.name = name;
        this.album = album;

    }

    public Song(String name, String album, String genre, Integer artistId) {

        this.name = name;
        this.album = album;
        this.genre = genre;
        this.artistId = artistId;

    }

    public Integer getId() {

        return this.id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getName() {

        return this.name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getAlbum() {

        return this.album;

    }

    public void setAlbum(String album) {

        this.album = album;

    }

    public String getGenre() {

        return this.genre;

    }

    public void setGenre(String genre) {

        this.genre = genre;

    }

    public Integer getArtistId() {

        return this.artistId;

    }

    public void setArtistId(Integer artistId) {

        this.artistId = artistId;

    }

}