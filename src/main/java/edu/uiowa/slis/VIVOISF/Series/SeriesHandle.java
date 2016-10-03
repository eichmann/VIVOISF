package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesHandleIterator theSeries = (SeriesHandleIterator)findAncestorWithClass(this, SeriesHandleIterator.class);
			pageContext.getOut().print(theSeries.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for handle tag ");
		}
		return SKIP_BODY;
	}
}

