public class StreamingService extends MusicPlayer{
    private String streamingService;

    public StreamingService(String songTitle, String artistName, double price, String steamingService){
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
    public String toString(){
        return super.getSongTitle() + " by " + super.getArtistName() + " on "  + streamingService + " for $" + super.getPrice();
    }
}
