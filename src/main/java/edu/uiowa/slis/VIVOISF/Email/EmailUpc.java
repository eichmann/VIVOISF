package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailUpcIterator theEmail = (EmailUpcIterator)findAncestorWithClass(this, EmailUpcIterator.class);
			pageContext.getOut().print(theEmail.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for upc tag ");
		}
		return SKIP_BODY;
	}
}

