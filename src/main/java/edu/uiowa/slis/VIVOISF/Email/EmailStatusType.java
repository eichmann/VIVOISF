package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailStatusIterator theEmailStatusIterator = (EmailStatusIterator)findAncestorWithClass(this, EmailStatusIterator.class);
			pageContext.getOut().print(theEmailStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for status tag ");
		}
		return SKIP_BODY;
	}
}

