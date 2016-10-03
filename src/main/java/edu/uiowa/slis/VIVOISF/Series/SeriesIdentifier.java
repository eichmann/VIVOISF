package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesIdentifierIterator theSeries = (SeriesIdentifierIterator)findAncestorWithClass(this, SeriesIdentifierIterator.class);
			pageContext.getOut().print(theSeries.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for identifier tag ");
		}
		return SKIP_BODY;
	}
}

