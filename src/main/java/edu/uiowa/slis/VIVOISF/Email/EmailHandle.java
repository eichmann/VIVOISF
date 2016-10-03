package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailHandleIterator theEmail = (EmailHandleIterator)findAncestorWithClass(this, EmailHandleIterator.class);
			pageContext.getOut().print(theEmail.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for handle tag ");
		}
		return SKIP_BODY;
	}
}

