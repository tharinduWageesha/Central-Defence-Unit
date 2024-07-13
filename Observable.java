package defenceunit2;
import java.util.ArrayList;

public class Observable implements ObservableInterface{ //ControlRoom
    private int riskLevel;
    private ArrayList<Observer>observerList=new ArrayList<>();
    
	
	public void addObserver(Observer ob){
		observerList.add(ob);
              
	}	
	
    /**
     *
     * @param riskLevel
     */
    @Override
	public void setRiskLevel(int riskLevel){
		if(this.riskLevel!=riskLevel){
			this.riskLevel=riskLevel;
			notifyObject();
                        System.out.println(riskLevel);
		}
	}
        public void notifyObject(){
		for(Observer ob : observerList){
			ob.position(riskLevel);
                        
		}
                 
	}
        //----------------------------- AREA CLEAR -------------------------------------------------------------------
    @Override
        public void areaClear(){
            for(Observer ob : observerList){
			ob.areaClear();
                        
		}
        }
        
          //----------------------------- AREA Risk -------------------------------------------------------------------
    @Override
        public void areaRisk(){
            for(Observer ob : observerList){
			ob.areaRisk();
                        
		}
        }
        

    
        
	
        
    @Override
        public void mainMsg(String msg,int hel,int tan,int sub){
            for(Observer ob : observerList){
			ob.mainMsg(msg,hel,tan,sub);
                        
		}
        }

        

        
    
}


        