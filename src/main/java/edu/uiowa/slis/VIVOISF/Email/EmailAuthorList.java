package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailAuthorListIterator theEmailAuthorListIterator = (EmailAuthorListIterator)findAncestorWithClass(this, EmailAuthorListIterator.class);
			pageContext.getOut().print(theEmailAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for authorList tag ");
		}
		return SKIP_BODY;
	}
}

