package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesPmidIterator theSeries = (SeriesPmidIterator)findAncestorWithClass(this, SeriesPmidIterator.class);
			pageContext.getOut().print(theSeries.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for pmid tag ");
		}
		return SKIP_BODY;
	}
}

