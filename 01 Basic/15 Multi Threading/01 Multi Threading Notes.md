

Thread t1 = new Thread(p1)
t1.setPriority(Thread.MAX_PRIORITY);
t1.start()
t1.join();
t1.join(5000);
t1.join(5000,5 );

public synchronized void increment() {
    count++;
}


Thread Communication
    sleep
    yield
    wait
    notify
    notifuAll