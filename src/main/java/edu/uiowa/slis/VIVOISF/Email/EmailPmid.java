package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailPmidIterator theEmail = (EmailPmidIterator)findAncestorWithClass(this, EmailPmidIterator.class);
			pageContext.getOut().print(theEmail.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for pmid tag ");
		}
		return SKIP_BODY;
	}
}

