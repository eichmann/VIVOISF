package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailIdentifierIterator theEmail = (EmailIdentifierIterator)findAncestorWithClass(this, EmailIdentifierIterator.class);
			pageContext.getOut().print(theEmail.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for identifier tag ");
		}
		return SKIP_BODY;
	}
}

