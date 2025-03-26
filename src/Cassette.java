public class Cassette extends MusicPlayer{
    private String hasCassettePlayer;

    public Cassette(String songTitle, String artistName, double price, String hasCassettePlayer){
        super(songTitle, artistName, price);
        this.hasCassettePlayer = hasCassettePlayer;
    }

    //getter
    public String getHasCassettePlayer(){
        return hasCassettePlayer;
    }

    //setter
    public void setHasCassettePlayer(String hasCassettePlayer){
        this.hasCassettePlayer = hasCassettePlayer;
    }

    //override toString method
    @Override
    public String toString() {
        return super.getSongTitle() + " by " + getArtistName() + " for $" + getPrice() + " on cassette!";
    }
}
