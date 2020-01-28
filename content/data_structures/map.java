Map<String, String> mapA = Map.of("key1", "element1");

mapA.put("key2", "element2");

mapA.remove("key2")

if (mapA.contains("key1")) {
    System.out.println(mapA.get("key1")); // element2
}

