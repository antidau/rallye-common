package de.rallye.model.structures;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class AdditionalResource implements Serializable {

	public static String additionalResourcesToString(List<AdditionalResource> res) {
		StringBuilder sb = new StringBuilder();

		if (res == null || res.size() == 0)
			return null;
		
		for (AdditionalResource r: res) {
			sb.append(r.toString()).append(',');
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	
	public static List<AdditionalResource> additionalResourcesFromString(String in) {
		List<AdditionalResource> res = new ArrayList<AdditionalResource>();
		
		if (in == null || in.length() == 0)
			return res;
		
		for (String s: in.split(",")) {
			res.add(AdditionalPicture.fromString(s));
		}
		
		return res;
	}
}
