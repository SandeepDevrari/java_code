package adapterDesign;
public class AdapterDesign_Assignment{
	private AdapterDesign_Pen pen;
	
	public void setPen(AdapterDesign_Pen pen){
		this.pen=pen;
	}
	public AdapterDesign_Pen getPen(){
		return pen;
	}
	public void writeAssignment(String work){
		pen.write(work);
	}
}
