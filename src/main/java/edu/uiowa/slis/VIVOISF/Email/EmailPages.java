package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailPages currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailPagesIterator theEmail = (EmailPagesIterator)findAncestorWithClass(this, EmailPagesIterator.class);
			pageContext.getOut().print(theEmail.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for pages tag ");
		}
		return SKIP_BODY;
	}
}

