import java.util.ArrayList;
import java.util.Comparator;

public class RiversList {
    private ArrayList<River> rivers;
    public RiversList() {rivers = new ArrayList<>();}

    public void addRiver(River r) {rivers.add(r);}

    public River findMinLength(){
        River minRiver = rivers.get(0);
        for (River r : rivers){
            if (r.getLength() < minRiver.getLength()){
                minRiver = r;
            }
        }
        return minRiver;
    }

    public int findAverageLength(){
        int length = 0;
        for (River r : rivers){
            length += r.getLength();
        }
        int averageLength = length / rivers.size();
        return averageLength;
    }
    public void printRiversWithMoreLength(){
        int avgLength = findAverageLength();
        for (River r : rivers){
            if (r.getLength() > avgLength){
                r.printInfo();
            }
        }
    }

    public void printSortedRivers(){
        rivers.stream().sorted(Comparator.comparing(River::getName)).forEach(River::printInfo);
    }
}
