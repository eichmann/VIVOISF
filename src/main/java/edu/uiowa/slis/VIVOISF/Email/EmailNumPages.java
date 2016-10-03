package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailNumPagesIterator theEmail = (EmailNumPagesIterator)findAncestorWithClass(this, EmailNumPagesIterator.class);
			pageContext.getOut().print(theEmail.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for numPages tag ");
		}
		return SKIP_BODY;
	}
}

