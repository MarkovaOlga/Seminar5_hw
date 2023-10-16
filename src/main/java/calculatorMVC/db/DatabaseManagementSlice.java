package calculatorMVC.db;

import calculatorMVC.db.fletch.FletchData;
import calculatorMVC.db.fletch.Fletchable;
import calculatorMVC.db.save.Savable;
import calculatorMVC.db.save.SaveData;

public class DatabaseManagementSlice {
    public void saveData(String data) {
        Savable saveData = new SaveData();
        // Реализация сохранения данных в базу данных
        saveData.saveData(data);
    }

    String fetchData() {
        Fletchable fletchData = new FletchData();
        // Реализация извлечения данных из базы данных
        return fletchData.fletchData();
    }
}