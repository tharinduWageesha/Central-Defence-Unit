
package defenceunit2;

public interface Observer {
    public void position(int riskLevel);
    public void areaClear();
    public void areaRisk();
    public void mainMsg(String msg,int hel,int tan,int sub);

}
