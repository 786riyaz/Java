ExecutorService service = Executors.newSingleThreadExecutor();
ExecutorService service = Executors.newFixedThreadPool(3)
PrintTask task1 = new PrintTask(*)
PrintTask task2 = new PrintTask(#)
PrintTask task3 = new PrintTask($)
service.submit(task1);
service.submit(task2);
service.submit(task3);
service.shutdown();
service.awaitTermination(10, TimeUnit.SECONDS){
    executor.shutdownNow();
}