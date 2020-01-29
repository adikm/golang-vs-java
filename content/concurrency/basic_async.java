CompletableFuture.runAsync(() -> System.out.println("Hello async!"));
for (int i=0; i<5; i++) {
    System.out.print("Hey! ");
    Thread.sleep(100);
}
// Hey! Hello async!
// Hey! Hey! Hey! Hey!