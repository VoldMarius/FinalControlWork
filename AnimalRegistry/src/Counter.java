public  class Counter  implements AutoCloseable {
    private int count;


            public void count() {
                count = 0;
            }

            public void add() {
                count++;
                System.out.println("Добавлено новое животное. Текущее значение счетчика: " + count);
            }

            public int getcount() {
                return count;
            }



    @Override
    public void close() throws Exception {
        if (count == 0) {
            throw new Exception("Работа с объектом Счетчик была не в ресурсном try или ресурс остался открыт");
        }
        System.out.println("Закрытие ресурса Счетчик");
    }
}
