package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailShortTitleIterator theEmail = (EmailShortTitleIterator)findAncestorWithClass(this, EmailShortTitleIterator.class);
			pageContext.getOut().print(theEmail.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

