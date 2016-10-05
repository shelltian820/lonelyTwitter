package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by stian3 on 9/27/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    /**
     * Instantiates a new Tweet list test.
     */
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    /**
     * Test adding tweet to tweet list and checks if tweet list has that tweet
     */
    public void testAddTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!!!");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test if empty tweet list has tweets, then add a tweet, then test if
     * tweet list is empty or not
     */
    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!!!");
        assertFalse(list.hasTweet(tweet));
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Add 2 new tweets to new tweet list. Test if first added tweet is in
     * position 0 and second added tweet is in position 1.
     */
    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        list.addTweet(a);
        list.addTweet(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));

    }

    /**
     * Add a new tweet to new tweet list then remove it, test if tweet list is empty
     */
    public void testRemoveTweet(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello!");

        list.removeTweet(a);

        assertFalse(list.hasTweet(a));
    }

    /**
     * Add 3 tweets to tweet list, then test counting number of tweets
     */
    public void testGetCount(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");
        Tweet c = new NormalTweet("WASSUP!");

        list.addTweet(a);
        list.addTweet(b);
        list.addTweet(c);

        assertEquals(3,list.getCount());

    }
}
