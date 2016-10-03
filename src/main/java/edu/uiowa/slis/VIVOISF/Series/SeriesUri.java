package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesUri currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesUriIterator theSeries = (SeriesUriIterator)findAncestorWithClass(this, SeriesUriIterator.class);
			pageContext.getOut().print(theSeries.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for uri tag ");
		}
		return SKIP_BODY;
	}
}

