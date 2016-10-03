package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailAsinIterator theEmail = (EmailAsinIterator)findAncestorWithClass(this, EmailAsinIterator.class);
			pageContext.getOut().print(theEmail.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for asin tag ");
		}
		return SKIP_BODY;
	}
}

