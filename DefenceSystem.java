package defenceunit2;


public class DefenceSystem {
   public static void main(String[] args) {
                Observable observable=new Observable() ;
                VehicleObservable vehicleObservable=new VehicleObservable();
		observable.addObserver(new Helicopter(vehicleObservable));
                observable.addObserver(new Tank(vehicleObservable));
                observable.addObserver(new Submarine(vehicleObservable));
                vehicleObservable.addObserver(new MainController(observable,vehicleObservable));
               
                
 }
}
    

