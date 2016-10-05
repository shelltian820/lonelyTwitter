package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The type Tweet.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message becomes the tweet's message
     *
     *
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message becomes the tweet's message
     * @param date    the date becomes the tweet's date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * Is important boolean.
     *
     * @return the boolean that determines if tweet is important
     */
    public abstract Boolean isImportant();


    /**
     * Sets message.
     *
     * @param message it becomes the new message of the tweet
     * @throws TweetTooLongException the tweet too long exception prevents you from entering a tweet
     * longer than 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets date.
     *
     * @param date the date replaces the tweet's old date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets message.
     *
     * @return the tweet's message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets date.
     *
     * @return the tweet's date
     */
    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
}
