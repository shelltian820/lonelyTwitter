package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The interface Tweetable.
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message of tweet
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date of tweet
     */
    public Date getDate();
}
