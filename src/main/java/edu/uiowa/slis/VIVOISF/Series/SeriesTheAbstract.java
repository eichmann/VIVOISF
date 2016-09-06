package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesTheAbstractIterator theSeries = (SeriesTheAbstractIterator)findAncestorWithClass(this, SeriesTheAbstractIterator.class);
			pageContext.getOut().print(theSeries.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

