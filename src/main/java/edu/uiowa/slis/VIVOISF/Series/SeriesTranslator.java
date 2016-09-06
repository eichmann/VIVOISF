package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesTranslatorIterator theSeriesTranslatorIterator = (SeriesTranslatorIterator)findAncestorWithClass(this, SeriesTranslatorIterator.class);
			pageContext.getOut().print(theSeriesTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for translator tag ");
		}
		return SKIP_BODY;
	}
}

