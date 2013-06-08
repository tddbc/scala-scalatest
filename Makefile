all: test

test:
	./sbt test

test-continuous:
	./sbt ~test

idea:
	./sbt gen-idea

eclipse:
	./sbt eclipse
