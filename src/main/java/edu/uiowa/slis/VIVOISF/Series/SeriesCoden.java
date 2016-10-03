package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesCodenIterator theSeries = (SeriesCodenIterator)findAncestorWithClass(this, SeriesCodenIterator.class);
			pageContext.getOut().print(theSeries.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for coden tag ");
		}
		return SKIP_BODY;
	}
}

