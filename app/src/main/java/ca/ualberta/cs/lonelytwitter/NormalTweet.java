package ca.ualberta.cs.lonelytwitter;

/**
 * The type Normal tweet.
 */
public class NormalTweet extends Tweet implements Tweetable {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message of tweet
     */
    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
