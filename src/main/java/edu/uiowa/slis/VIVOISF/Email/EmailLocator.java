package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailLocatorIterator theEmail = (EmailLocatorIterator)findAncestorWithClass(this, EmailLocatorIterator.class);
			pageContext.getOut().print(theEmail.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for locator tag ");
		}
		return SKIP_BODY;
	}
}

