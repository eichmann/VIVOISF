package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailContent currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailContentIterator theEmail = (EmailContentIterator)findAncestorWithClass(this, EmailContentIterator.class);
			pageContext.getOut().print(theEmail.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for content tag ");
		}
		return SKIP_BODY;
	}
}

