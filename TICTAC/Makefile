NAME= Main
SRCS= Main.java TIC.java TAC.java Turno.java
JC= javac
JFLAGS= -g

all: $(NAME)

$(NAME):
	$(JC) $(JFLAGS) $(SRCS)

run: all
	java $(NAME)

clean:
	rm -rf *.class

re: clean run
