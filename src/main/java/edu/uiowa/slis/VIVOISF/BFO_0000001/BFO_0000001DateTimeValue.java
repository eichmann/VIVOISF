package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001DateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001DateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001DateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001DateTimeValueIterator theBFO_0000001DateTimeValueIterator = (BFO_0000001DateTimeValueIterator)findAncestorWithClass(this, BFO_0000001DateTimeValueIterator.class);
			pageContext.getOut().print(theBFO_0000001DateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

