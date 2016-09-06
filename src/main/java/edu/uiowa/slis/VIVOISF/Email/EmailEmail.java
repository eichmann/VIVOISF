package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEmail.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailEmailIterator theEmail = (EmailEmailIterator)findAncestorWithClass(this, EmailEmailIterator.class);
			pageContext.getOut().print(theEmail.getEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for email tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for email tag ");
		}
		return SKIP_BODY;
	}
}

