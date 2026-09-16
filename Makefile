JFLAGS = -g
JC = javac
JVM = java

# Find all java files in src and utils directories
SOURCES := $(wildcard src/*.java) $(wildcard utils/*.java)

# The default target
all: build

build:
	$(JC) $(JFLAGS) $(SOURCES)

clean:
	rm -f src/*.class utils/*.class

run: build
	$(JVM) src.Main

.PHONY: all build clean run
