package queue.queue_with_nItems;

public class Queue {
    private int maxSize;
    private long[] qurArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        qurArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value){     //Вставка элемента в конец очереди
        if (rear == maxSize-1) {        //Циклический перенос
            rear = -1;
        }
        qurArray[++rear] = value;       //Увеличение rear и вставка
        nItems++;                       //Увеличение количества элементов
    }

    public long remove(){               //Извлечение элемента в начале очереди
        long temp = qurArray[front++];  //Выбор и увеличение front
        if (front == maxSize){
            front = 0;
        }
        nItems--;                       //Уменьшение количества элементов
        return temp;
    }

    public long peekFront(){            //Чтение элемента в начале очереди
        return qurArray[front];
    }

    public boolean isEmpty(){           //true, если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull(){            //true, если очередь заполнена
        return (nItems == maxSize);
    }

    public int size(){                  //количество элементов в очереди
        return nItems;
    }

}
