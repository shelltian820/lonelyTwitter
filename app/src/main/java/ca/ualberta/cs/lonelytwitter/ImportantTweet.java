package ca.ualberta.cs.lonelytwitter;

/**
 * The type Important tweet.
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message of tweet
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
