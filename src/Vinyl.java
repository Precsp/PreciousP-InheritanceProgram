/**
 * Represents a physical way to listen to music -- vinyl records
 */
public class Vinyl extends MusicPlayer
{
    private String hasRecordPlayer;

    public Vinyl(String songTitle, String artistName, double price, String hasRecordPlayer) {
        super(songTitle, artistName, price);
        this.hasRecordPlayer = hasRecordPlayer;
    }

    public String getHasRecordPlayer() {
        return hasRecordPlayer;
    }

    public void setHasRecordPlayer(String hasRecordPlayer) {
        this.hasRecordPlayer = hasRecordPlayer;
    }

    @Override
    public String toString() {
        return super.getSongTitle() + " by " + super.getArtistName() + " for $" + getPrice() + " on vinyl!";
    }
}
