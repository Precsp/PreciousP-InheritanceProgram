public class Vinyl extends MusicPlayer{
    private String streamingService;

    public Vinyl(String songTitle, String artistName, double price, String steamingService){
        super (songTitle, artistName, price);
        this.streamingService = steamingService;
    }

    //getter
    public String getStreamingService(){
        return streamingService;
    }

    //setter
    public void setStreamingService(String streamingService){
        this.streamingService = streamingService;
    }

    //overriden toString method
    @Override
    public String toString(){}
}
