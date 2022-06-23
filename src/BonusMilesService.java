public class BonusMilesService {
    public int calculate(int cost) {
        int miles;
        if (cost > 1000) {                  // А где в условии про милли что-либо про 1000?
            miles = cost / 20;              // Извините, не понимаю, что сделала не так. В этой строке что если переданный параметр больше 1000, то мили расчитываются так
        } else {                            // во всех остальных случаях
            miles = 0;                      // мили не начисляются
        }
        return miles;
    }
}
