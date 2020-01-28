mapA := map[string]string{"key1":"element1"}

mapA["key2"] = "element2"

delete(mapA, "key2")

if value, ok = mapA["key1"]; ok == true {
	mapA["key1"] // element2
}