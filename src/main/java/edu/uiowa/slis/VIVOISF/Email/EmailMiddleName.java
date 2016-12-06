package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailMiddleNameIterator theEmail = (EmailMiddleNameIterator)findAncestorWithClass(this, EmailMiddleNameIterator.class);
			pageContext.getOut().print(theEmail.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for middleName tag ");
		}
		return SKIP_BODY;
	}
}

