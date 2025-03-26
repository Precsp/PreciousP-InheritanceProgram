public class MusicPlayer
{
    private String songTitle;
    private String artistName;
    private double price;

    //superclass constructor
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

    //toString method
    public String toString()
    {
        return songTitle + " by " + artistName + ", $ " + price;
    }
}