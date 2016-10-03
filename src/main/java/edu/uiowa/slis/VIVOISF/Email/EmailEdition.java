package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailEditionIterator theEmail = (EmailEditionIterator)findAncestorWithClass(this, EmailEditionIterator.class);
			pageContext.getOut().print(theEmail.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for edition tag ");
		}
		return SKIP_BODY;
	}
}

