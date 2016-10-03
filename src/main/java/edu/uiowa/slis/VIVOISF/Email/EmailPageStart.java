package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailPageStartIterator theEmail = (EmailPageStartIterator)findAncestorWithClass(this, EmailPageStartIterator.class);
			pageContext.getOut().print(theEmail.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

