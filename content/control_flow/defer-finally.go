func write(fileName string, text string) {
	file, err := os.Create(fileName)
	if err != nil {
		panic(err)
	}
	defer file.Close() // if WriteString fails, it'll make sure that file is closed
	_, err = io.WriteString(file, text)
	if err != nil {
		panic(err)
	}
}
