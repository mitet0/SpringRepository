package dataConverter;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

/**
 * Created by Mitet0 on 3/27/2018
 */
@Service
public class DataConverterService {

    public String converter(String date) {
        final String[] parseDate = date.split("\\.");
        int day = Integer.parseInt(parseDate[0]);
        int month = Integer.parseInt(parseDate[1]);
        int year = Integer.parseInt(parseDate[2]);

        LocalDate localDate = LocalDate.of(year, month, day);

        return localDate.getDayOfWeek().toString();
    }
}
