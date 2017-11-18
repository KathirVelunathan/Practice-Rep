import java.io.File
class Example {
      static void main(String[] args) {
	new File("C:\DEVOPS\Groovy\address.txt").eachLine {
	line -> println "print each line: $line";
	}
	
	}
	}
