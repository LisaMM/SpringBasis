package be.vdab.converters;

import java.text.*;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String datumAlsString) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return dateFormat.parse(datumAlsString);
		} catch (ParseException ex) {
			throw new IllegalArgumentException();
		}
	}

}
