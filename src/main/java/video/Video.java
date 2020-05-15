package video;

import video.sponsor.Sponsor;

public abstract class Video {
	
	private String title;
	protected int views;
	private Sponsor sponsor;
	protected Boolean premium;

	public Video(String title, Sponsor sponsor) {
		super();
		this.title = title;
		this.views = 0;
		this.sponsor = sponsor;
		this.premium = false;
	}
	
	public abstract void getComments();
	
	public abstract void addViews();
	
	public abstract int getViews();
	
	public String getTitle() {
		return this.title;
	}
	
	public Sponsor getSponsor() {
		return this.sponsor;
	}
	
	public Boolean premium() {
		return this.premium;
	}
	
	public String toString() {
		return "Title: "+this.title+", Views: "+this.getViews()+", Sponsor: "+this.sponsor.revenue();
	}
}
