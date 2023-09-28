package Classes;

import java.time.LocalDate;
import java.util.List;

public interface All_Registry<T> { //интерфейс All_Animal_Registry описывает базовые операции
                                          // для работы с реестром объектов типа T.

        List <T> getAll();     // метод для получения всех объектов типа T из реестра.
        T getById(int id);      // метод для получения объекта типа T  по его уникальному идентификатору (id).
        int create(int type, String name, LocalDate date);     // метод для создания нового объекта типа T и добавления его в реестр.
                                // Возвращает идентификатор созданного объекта.
        int update(T item);     // метод для обновления объекта типа T в реестре.
                                // Возвращает количество измененных объектов.
        void delete (int item); // метод для удаления объекта типа T из реестра по его уникальному идентификатору
    }

