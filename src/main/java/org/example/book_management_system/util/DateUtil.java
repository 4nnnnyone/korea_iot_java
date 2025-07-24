package org.example.book_management_system.util;

/*

    현재 시간 포맷: "yyyy-MM-dd HH:mm:ss"
    정적 메서드 now()를 통해 현재 시간 문자열 반환

 */


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static String now() {
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern(PATTERN));
    }
}
