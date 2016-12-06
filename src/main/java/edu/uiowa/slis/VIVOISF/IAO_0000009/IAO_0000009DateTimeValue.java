package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009DateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009DateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009DateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009DateTimeValueIterator theIAO_0000009DateTimeValueIterator = (IAO_0000009DateTimeValueIterator)findAncestorWithClass(this, IAO_0000009DateTimeValueIterator.class);
			pageContext.getOut().print(theIAO_0000009DateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

