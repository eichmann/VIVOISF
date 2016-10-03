package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesLccnIterator theSeries = (SeriesLccnIterator)findAncestorWithClass(this, SeriesLccnIterator.class);
			pageContext.getOut().print(theSeries.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for lccn tag ");
		}
		return SKIP_BODY;
	}
}

