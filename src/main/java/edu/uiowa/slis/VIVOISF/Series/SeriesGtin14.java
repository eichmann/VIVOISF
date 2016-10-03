package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesGtin14Iterator theSeries = (SeriesGtin14Iterator)findAncestorWithClass(this, SeriesGtin14Iterator.class);
			pageContext.getOut().print(theSeries.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

