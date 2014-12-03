package figglewatts.lsdrsdk.SeqCreate.datatypes;

public class Sequence {
	private SequenceData data;
	
	public void setData(SequenceData _data) {
		this.data = _data;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
