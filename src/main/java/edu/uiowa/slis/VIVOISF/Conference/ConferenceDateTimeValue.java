package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceDateTimeValueIterator theConferenceDateTimeValueIterator = (ConferenceDateTimeValueIterator)findAncestorWithClass(this, ConferenceDateTimeValueIterator.class);
			pageContext.getOut().print(theConferenceDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

