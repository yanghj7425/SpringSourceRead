package com.yhj.dateparse.propertyeditor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义属性编辑器 DI 注入的时候 String 类型不能自动转换为 Date 类型
 *
 */
public class DatePropertyEditor extends PropertyEditorSupport {

	private String format;// = "yyyy-MM-dd";


	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(getFormat());
		try {
			Date date = simpleDateFormat.parse(text);

			this.setValue(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getFormat() {
		return format;
	}
}
