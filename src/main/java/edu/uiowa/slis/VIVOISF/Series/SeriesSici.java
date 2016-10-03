package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesSici currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesSiciIterator theSeries = (SeriesSiciIterator)findAncestorWithClass(this, SeriesSiciIterator.class);
			pageContext.getOut().print(theSeries.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for sici tag ");
		}
		return SKIP_BODY;
	}
}

