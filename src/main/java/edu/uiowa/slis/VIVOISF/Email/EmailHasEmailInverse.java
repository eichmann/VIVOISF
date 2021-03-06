package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasEmailInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasEmailInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasEmailInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasEmailInverseIterator theEmailHasEmailInverseIterator = (EmailHasEmailInverseIterator)findAncestorWithClass(this, EmailHasEmailInverseIterator.class);
			pageContext.getOut().print(theEmailHasEmailInverseIterator.getHasEmailInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

