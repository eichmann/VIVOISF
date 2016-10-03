package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailAuthorListIterator theEmailAuthorListIterator = (EmailAuthorListIterator)findAncestorWithClass(this, EmailAuthorListIterator.class);
			pageContext.getOut().print(theEmailAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for authorList tag ");
		}
		return SKIP_BODY;
	}
}

