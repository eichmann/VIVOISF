package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesDateTimeValueIterator theSeriesDateTimeValueIterator = (SeriesDateTimeValueIterator)findAncestorWithClass(this, SeriesDateTimeValueIterator.class);
			pageContext.getOut().print(theSeriesDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

