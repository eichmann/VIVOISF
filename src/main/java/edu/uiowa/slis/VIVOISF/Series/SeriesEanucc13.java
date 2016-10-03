package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesEanucc13Iterator theSeries = (SeriesEanucc13Iterator)findAncestorWithClass(this, SeriesEanucc13Iterator.class);
			pageContext.getOut().print(theSeries.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

