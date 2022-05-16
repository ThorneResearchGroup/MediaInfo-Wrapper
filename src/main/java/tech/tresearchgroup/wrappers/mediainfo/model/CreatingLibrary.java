package tech.tresearchgroup.wrappers.mediainfo.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatingLibrary{

	@SerializedName("name")
	private String name;

	@SerializedName("version")
	private String version;

	@SerializedName("url")
	private String url;
}