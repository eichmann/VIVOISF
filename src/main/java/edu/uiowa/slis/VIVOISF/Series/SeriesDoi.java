package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesDoiIterator theSeries = (SeriesDoiIterator)findAncestorWithClass(this, SeriesDoiIterator.class);
			pageContext.getOut().print(theSeries.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for doi tag ");
		}
		return SKIP_BODY;
	}
}

