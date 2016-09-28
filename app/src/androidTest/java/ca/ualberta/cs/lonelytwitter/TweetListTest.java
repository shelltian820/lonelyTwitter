package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by stian3 on 9/27/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!!!");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello!!!");
        assertFalse(list.hasTweet(tweet));
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello!");
        Tweet b = new NormalTweet("Hi!");

        list.addTweet(a);
        list.addTweet(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));

    }

    public void testRemoveTweet(){
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello!");

        list.removeTweet(a);

        assertFalse(list.hasTweet(a));
    }

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
