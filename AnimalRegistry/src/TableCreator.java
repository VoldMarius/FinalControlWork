import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TableCreator {
    public void createTable( ResultSet resultSet) throws SQLException {
        // Получаем метаданные о столбцах результирующего набора
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Создаем массив с названиями столбцов таблицы
        String[] columnNames = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            columnNames[i] = metaData.getColumnName(i + 1);
        }

        // Создаем список для хранения данных из базы данных
        List<Object[]> rowData = new ArrayList<>();

        // Заполняем список данными из базы данных
        while (resultSet.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                row[i] = resultSet.getObject(i + 1);
            }
            rowData.add(row);
        }

        // Преобразуем список в двумерный массив
        Object[][] data = new Object[rowData.size()][columnCount];
        for (int i = 0; i < rowData.size(); i++) {
            data[i] = rowData.get(i);
        }

        // Создаем модель таблицы на основе данных и названий столбцов
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Создаем таблицу на основе модели
        JTable table = new JTable(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Отключаем автоматическое изменение размеров столбцов

        // Устанавливаем размеры столбцов
        for (int i = 0; i < columnCount; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(120);
        }

        // Создаем окно с прокручиваемой панелью, содержащей таблицу
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Устанавливаем размеры окна и делаем его видимым
        frame.setSize(500, 200);
        frame.pack();
        frame.setVisible(true);
    }
}
