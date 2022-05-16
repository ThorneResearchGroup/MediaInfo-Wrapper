package tech.tresearchgroup.wrappers.mediainfo.model;

import com.google.gson.annotations.SerializedName;

public class MediaInfoOutput{

	@SerializedName("creatingLibrary")
	private CreatingLibrary creatingLibrary;

	@SerializedName("media")
	private Media media;
}