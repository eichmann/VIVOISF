package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailOwnerIterator theEmailOwnerIterator = (EmailOwnerIterator)findAncestorWithClass(this, EmailOwnerIterator.class);
			pageContext.getOut().print(theEmailOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for owner tag ");
		}
		return SKIP_BODY;
	}
}

