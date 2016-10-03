package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesEissnIterator theSeries = (SeriesEissnIterator)findAncestorWithClass(this, SeriesEissnIterator.class);
			pageContext.getOut().print(theSeries.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for eissn tag ");
		}
		return SKIP_BODY;
	}
}

