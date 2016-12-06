package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009DateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009DateTimeIntervalIterator theIAO_0000009DateTimeIntervalIterator = (IAO_0000009DateTimeIntervalIterator)findAncestorWithClass(this, IAO_0000009DateTimeIntervalIterator.class);
			pageContext.getOut().print(theIAO_0000009DateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

