void write(String fileName, String text) {
	File file = new File(fileName);
	PrintWriter writer;
	try {
		file.createNewFile();
		writer = new PrintWriter(file)
		writer.println(text);
	} catch (IOException e) {
		throw new RuntimeException(e);
	} finally {
		writer.close(); // finally always executes at the end
	}
}