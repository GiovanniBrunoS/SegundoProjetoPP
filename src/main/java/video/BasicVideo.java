package video;

import video.sponsor.Sponsor;

public class BasicVideo extends Video {

	public BasicVideo(String title, Sponsor sponsor) {
		super(title, sponsor);
	}

	@Override
	public void getComments() {
		System.out.println("Basic Videos have no comments!");
	}

	@Override
	public void addViews() {
		this.views += 1;
	}

	@Override
	public int getViews() {
		return this.views;
	}
}
