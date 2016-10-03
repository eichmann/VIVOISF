package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesIsbn10Iterator theSeries = (SeriesIsbn10Iterator)findAncestorWithClass(this, SeriesIsbn10Iterator.class);
			pageContext.getOut().print(theSeries.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

