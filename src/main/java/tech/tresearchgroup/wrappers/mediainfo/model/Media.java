package tech.tresearchgroup.wrappers.mediainfo.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Media{

	@SerializedName("track")
	private List<TrackItem> track;

	@SerializedName("@ref")
	private String ref;
}