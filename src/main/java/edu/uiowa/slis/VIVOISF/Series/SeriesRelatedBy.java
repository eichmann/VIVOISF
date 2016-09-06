package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRelatedByIterator theSeriesRelatedByIterator = (SeriesRelatedByIterator)findAncestorWithClass(this, SeriesRelatedByIterator.class);
			pageContext.getOut().print(theSeriesRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

