package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailPageEndIterator theEmail = (EmailPageEndIterator)findAncestorWithClass(this, EmailPageEndIterator.class);
			pageContext.getOut().print(theEmail.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

