package com.yhj.converter;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {
	@Override
	public Date convert(String s) {
		try {
			return DateUtils.parseDate(s, new String[]{"yyyy-MM-dd  HH:mm:ss"});
		} catch (ParseException e) {
			return null;
		}
	}
}
