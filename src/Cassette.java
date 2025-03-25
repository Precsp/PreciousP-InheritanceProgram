public class Cassette extends MusicPlayer{
    private String hasCassttePlayer;

    public Cassette(String songTitle, String artistName, double price, String hasCassettePlayer){
        super(songTitle, artistName, price);
        this.hasCassttePlayer = hasCassettePlayer;
    }

    //getter
    public String getHasCassettePlayer(){
        return hasCassttePlayer;
    }

    //setter
    public void setHasCassettePlayer(String hasCassettePlayer){
        this.hasCassttePlayer = hasCassettePlayer;
    }

    //override toString method

    @Override
    public String toString() {
        return
    }
}
