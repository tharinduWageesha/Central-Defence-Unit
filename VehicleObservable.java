
package defenceunit2;
import java.util.ArrayList;

public class VehicleObservable implements VehicleInterface{
    private ArrayList<VehicleObserver>vehiObserverList=new ArrayList<>();
    
    public void addObserver(VehicleObserver vehiOb){
		vehiObserverList.add(vehiOb);
              
	}
    
    
        
    @Override
    public void clearfromSub(int id){
            for(VehicleObserver vehiOb : vehiObserverList){
                vehiOb.clearfromSub(id);

            }
             
        }
        
    @Override
    public void riskfromSub(int id){
        for(VehicleObserver vehiOb : vehiObserverList){
                vehiOb.riskfromSub(id);

            }
    
    }
    
     public void msgfromSub(String msg,int id){
        for(VehicleObserver vehiOb : vehiObserverList){
                vehiOb.msgfromSub(msg,id);

            }
    
    }
} 
