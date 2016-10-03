package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesAsinIterator theSeries = (SeriesAsinIterator)findAncestorWithClass(this, SeriesAsinIterator.class);
			pageContext.getOut().print(theSeries.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for asin tag ");
		}
		return SKIP_BODY;
	}
}

