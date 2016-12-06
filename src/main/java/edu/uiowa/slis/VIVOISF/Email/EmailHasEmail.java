package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasEmailIterator theEmailHasEmailIterator = (EmailHasEmailIterator)findAncestorWithClass(this, EmailHasEmailIterator.class);
			pageContext.getOut().print(theEmailHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

