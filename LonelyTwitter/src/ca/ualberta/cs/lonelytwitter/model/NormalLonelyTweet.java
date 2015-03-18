package ca.ualberta.cs.lonelytwitter.model;

import java.io.Serializable;
import java.util.Date;


import android.util.Log;

public class NormalLonelyTweet extends LonelyTweet implements Serializable {

	private String thisIsntEvenMyFinalSringForm;

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString() {
		setThisIsntEvenMyFinalSringForm(getTweetDate() + " | " + getTweetBody());
		Log.i("tweet", getThisIsntEvenMyFinalSringForm());
		return getThisIsntEvenMyFinalSringForm();
	}

	public String getThisIsntEvenMyFinalSringForm() {
		return thisIsntEvenMyFinalSringForm;
	}

	public void setThisIsntEvenMyFinalSringForm(
			String thisIsntEvenMyFinalSringForm) {
		this.thisIsntEvenMyFinalSringForm = thisIsntEvenMyFinalSringForm;
	}
}
