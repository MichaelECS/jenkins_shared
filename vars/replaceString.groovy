def call(String file, String replacement) {
    def text = readFile file: "index.html"
    text = text.replaceAll("%BUILD_NUMBER%", replacement)
    writeFile file: file, text: text
}
