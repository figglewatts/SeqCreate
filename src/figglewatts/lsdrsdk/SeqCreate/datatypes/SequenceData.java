package figglewatts.lsdrsdk.SeqCreate.datatypes;

import java.util.ArrayList;
import java.util.List;

public class SequenceData {
	private List<String> maps = new ArrayList<String>();
	
	@Override
	public String toString() {
		String toReturn = "";
		int i = 0;
		for (String map : maps) {
			if (i != maps.size()-1) {
				toReturn += map + ", ";
			} else {
				toReturn += map;
			}
			i++;
		}
		return toReturn;
	}
}
