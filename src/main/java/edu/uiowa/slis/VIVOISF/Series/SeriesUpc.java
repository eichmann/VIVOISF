package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesUpcIterator theSeries = (SeriesUpcIterator)findAncestorWithClass(this, SeriesUpcIterator.class);
			pageContext.getOut().print(theSeries.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for upc tag ");
		}
		return SKIP_BODY;
	}
}

