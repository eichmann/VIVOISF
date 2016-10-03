package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailCodenIterator theEmail = (EmailCodenIterator)findAncestorWithClass(this, EmailCodenIterator.class);
			pageContext.getOut().print(theEmail.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for coden tag ");
		}
		return SKIP_BODY;
	}
}

