package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Constructs a tweet list and has methods that manipulate the list
 */
public class TweetList {

    /**
     * The Tweets.
     */
    List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add tweet.
     *
     * @param tweet adds a tweet to tweets
     */
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    /**
     * Checks if tweets contains a specific tweet
     *
     * @param tweet is the specified tweet
     * @return the boolean that indicates if tweets has the specified tweets
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * Get tweet object at a specific index
     *
     * @param i the index of tweet
     * @return the tweet at index i
     */
    public Tweet getTweet(int i){
        return tweets.get(i);
    }

    /**
     * Remove tweet from tweets
     *
     * @param a the tweet that is removed
     */
    public void removeTweet(Tweet a){
        tweets.remove(a);
    }

    /**
     * Counts number of tweet objects in tweets.
     *
     * @return the number of tweets in integer form
     */
    public int getCount(){
        return tweets.size();
    }
}
