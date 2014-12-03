package figglewatts.lsdrsdk.SeqCreate.datatypes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SequenceData {
	private List<String> maps = new ArrayList<String>();
	
	public void AddSequence(String sequence) {
		try {
			File f = new File(sequence);
			maps.add(f.getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace().toString());
		}
	}
	
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
