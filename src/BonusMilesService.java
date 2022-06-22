public class BonusMilesService {
    public int calculate (int cost){
        int miles;
        if (cost > 1000){
            miles = cost/20;
        }else{ miles = 0;
        }
        return miles;
    }
}
