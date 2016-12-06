package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003DateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003DateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003DateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003DateTimeValueIterator theIAO_0000003DateTimeValueIterator = (IAO_0000003DateTimeValueIterator)findAncestorWithClass(this, IAO_0000003DateTimeValueIterator.class);
			pageContext.getOut().print(theIAO_0000003DateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

