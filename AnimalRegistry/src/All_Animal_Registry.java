
import java.util.List;

public interface All_Animal_Registry<T> { //интерфейс All_Animal_Registry описывает базовые операции
                                          // для работы с репозиторием  объектов типа T.

         List <T> getAll();     // метод для получения всех объектов типа T из репозитория.
        T getById(int id);      // метод для получения объекта типа T  по его уникальному идентификатору (id).
        int create(T item);     // метод для создания нового объекта типа T и добавления его в репозиторий.
                                // Возвращает идентификатор созданного объекта.
        int update(T item);     // метод для обновления объекта типа T в репозитории.
                                // Возвращает количество измененных объектов.
        void delete (int item); // метод для удаления объекта типа T из репозитория по его уникальному идентификатору
    }

