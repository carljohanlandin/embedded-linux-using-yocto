CFLAGS = -g -Wall -DUSE_SYSCALL

TARGET = hello

all: $(TARGET)

$(TARGET): $(TARGET).c
	${CC} $(CFLAGS) $(LDFLAGS) -o $(TARGET) $(TARGET).c

install:
	install -d $(DESTDIR)
	install -m 0755 $(TARGET) $(DESTDIR)

clean:
	rm -f $(TARGET)

uninstall:
	rm $(DESTDIR)$(TARGET)
