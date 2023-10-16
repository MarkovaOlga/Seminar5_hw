package calculatorMVC.db.save;

public class SaveData implements Savable{
    @Override
    public void saveData(String data) {
        System.out.println("Сохранено в базе данных: " + data);
    }
}
