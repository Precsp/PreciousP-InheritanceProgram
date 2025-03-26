/**
 * Represents a general player with the song title, artist's name, and price of the song/album
 */
public class MusicPlayer
{
    private String songTitle;
    private String artistName;
    private double price;

    /**
     * Constructs MusicPlayer object with specific title, artist's name, and price
     * @param songTitle the title of the song
     * @param artistName the name of the artist
     * @param price the price of the song/album
     */
    public MusicPlayer (String songTitle, String artistName, double price)
    {
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.price = price;
    }

    //getters
    public String getSongTitle()
    {
        return songTitle;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public double getPrice ()
    {
        return price;
    }

    //setters
    public void setSongTitle (String songTitle)
    {
        this.songTitle = songTitle;
    }
    public void setArtistName (String artistName)
    {
        this.artistName = artistName;
    }

    public void setPrice (double price)
    {
        this.price = price;
    }

    /**
     * returns string representing musicplayer object
     * @return a string containing the song title, artist name, and price
     */
    public String toString()
    {
        return songTitle + " by " + artistName + ", $ " + price;
    }
}