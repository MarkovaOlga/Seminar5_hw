package calculatorMVC;

import calculatorMVC.db.DatabaseManagementSlice;
import calculatorMVC.db.fletch.FletchData;
import calculatorMVC.db.save.SaveData;
import calculatorMVC.view.ConsoleView;
import calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        DatabaseManagementSlice databaseManagementSlice = new DatabaseManagementSlice();
        IView view = new ConsoleView();
        view.runCalculator();
    }
}