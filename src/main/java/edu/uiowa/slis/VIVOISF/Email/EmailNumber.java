package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailNumberIterator theEmail = (EmailNumberIterator)findAncestorWithClass(this, EmailNumberIterator.class);
			pageContext.getOut().print(theEmail.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for number tag ");
		}
		return SKIP_BODY;
	}
}

