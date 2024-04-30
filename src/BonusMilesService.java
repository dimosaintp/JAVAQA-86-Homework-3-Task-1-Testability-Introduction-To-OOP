public class BonusMilesService {
    public int calculate(int ticket){
        int rub = 20; // для хранения количества рублей для одной бонусной мили.
        int mile;
        mile = (int) (ticket / rub);// Рассчитываем количество бонусных миль.
        return mile;
    }
}
