package tech.tresearchgroup.wrappers.mediainfo.model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Extra{

	@SerializedName("dialnorm_Minimum")
	private String dialnormMinimum;

	@SerializedName("dialnorm_String")
	private String dialnormString;

	@SerializedName("bsid")
	private String bsid;

	@SerializedName("dialnorm")
	private String dialnorm;

	@SerializedName("compr")
	private String compr;

	@SerializedName("acmod")
	private String acmod;

	@SerializedName("dialnorm_Count")
	private String dialnormCount;

	@SerializedName("lfeon")
	private String lfeon;

	@SerializedName("dialnorm_Maximum")
	private String dialnormMaximum;

	@SerializedName("dialnorm_Average")
	private String dialnormAverage;

	@SerializedName("compr_String")
	private String comprString;

	@SerializedName("dialnorm_Minimum_String")
	private String dialnormMinimumString;

	@SerializedName("dialnorm_Average_String")
	private String dialnormAverageString;

	@SerializedName("dialnorm_Maximum_String")
	private String dialnormMaximumString;

	@SerializedName("CodecConfigurationBox")
	private String codecConfigurationBox;
}