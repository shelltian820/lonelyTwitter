package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stian3 on 9/27/16.
 */
public class TweetList {

    List<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i){
        return tweets.get(i);
    }

    public void removeTweet(Tweet a){
        tweets.remove(a);
    }

    public int getCount(){
        return tweets.size();
    }
}
