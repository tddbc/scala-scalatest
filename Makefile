all: test

test:
	./sbt test

test-continuous:
	./sbt ~test

