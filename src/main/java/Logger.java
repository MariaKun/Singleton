import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static Logger logger = null;

    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    private Logger() {
    }

    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("[" + dtf.format(LocalDateTime.now())+ " "  + num++ + "] " + msg);
    }
}
