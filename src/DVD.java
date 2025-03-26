/**
 * Represents a physical way to listen to music--DVD's
 */
public class DVD extends MusicPlayer{
    private String hasDvdPlayer;

    public DVD(String songTitle, String artistName, double price, String hasDvdPlayer) {
        super(songTitle, artistName, price);
        this.hasDvdPlayer = hasDvdPlayer;
    }

    //getter
    public String getHasDvdPlayer() {
        return hasDvdPlayer;
    }

    //setter
    public void setHasDvdPlayer(String hasDvdPlayer) {
        this.hasDvdPlayer = hasDvdPlayer;
    }

    @Override
    public String toString(){
        return super.getSongTitle() + " by " + getArtistName() + " for $" + getPrice() + " on DVD!";
    }
}
