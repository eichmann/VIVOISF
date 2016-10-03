package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailUri currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailUriIterator theEmail = (EmailUriIterator)findAncestorWithClass(this, EmailUriIterator.class);
			pageContext.getOut().print(theEmail.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for uri tag ");
		}
		return SKIP_BODY;
	}
}

