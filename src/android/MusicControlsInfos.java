package com.homerours.musiccontrols;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MusicControlsInfos{
	public String artist;
  	public String album;
	public String track;
	public String ticker;
	public String cover;
	public boolean isPlaying;
	public boolean hasPrev;
	public boolean hasNext;
	public boolean hasClose;
	public boolean dismissable;
	public boolean hasScrubbing;
	public String playIcon;
	public String pauseIcon;
	public String prevIcon;
	public String nextIcon;
	public String closeIcon;
	public String notificationIcon;
	public long duration;
	public long elapsed;

	public MusicControlsInfos(JSONArray args) throws JSONException {
		final JSONObject params = args.getJSONObject(0);
		
		this.track = params.getString("track");
		this.artist = params.getString("artist");
		this.album = params.getString("album");
		this.ticker = params.getString("ticker");
		this.cover = params.getString("cover");
		this.isPlaying = params.getBoolean("isPlaying");
		this.hasPrev = params.getBoolean("hasPrev");
		this.hasNext = params.getBoolean("hasNext");
		this.hasClose = params.getBoolean("hasClose");
		this.dismissable = params.getBoolean("dismissable");
		this.playIcon = params.getString("playIcon");
		this.pauseIcon = params.getString("pauseIcon");
		this.prevIcon = params.getString("prevIcon");
		this.nextIcon = params.getString("nextIcon");
		this.closeIcon = params.getString("closeIcon");
		this.hasScrubbing = params.getBoolean("hasScrubbing");
		this.notificationIcon = params.getString("notificationIcon");
		this.duration = params.getLong("duration") * 1000;
		this.elapsed = params.getLong("elapsed") * 1000;
	}
}
