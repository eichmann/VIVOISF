package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030DateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030DateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030DateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030DateTimeIntervalIterator theIAO_0000030DateTimeIntervalIterator = (IAO_0000030DateTimeIntervalIterator)findAncestorWithClass(this, IAO_0000030DateTimeIntervalIterator.class);
			pageContext.getOut().print(theIAO_0000030DateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

