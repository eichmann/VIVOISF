package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesTranslatorIterator theSeriesTranslatorIterator = (SeriesTranslatorIterator)findAncestorWithClass(this, SeriesTranslatorIterator.class);
			pageContext.getOut().print(theSeriesTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for translator tag ");
		}
		return SKIP_BODY;
	}
}

