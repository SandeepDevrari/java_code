package adapterDesign;
public class AdapterDesign_Adapter implements AdapterDesign_Pen{
	AdapterDesign_PilotPen pp=new AdapterDesign_PilotPen();
	
	@Override
	public void write(String work){
		pp.mark(work);
	}
}
