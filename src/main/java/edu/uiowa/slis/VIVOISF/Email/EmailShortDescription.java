package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailShortDescriptionIterator theEmail = (EmailShortDescriptionIterator)findAncestorWithClass(this, EmailShortDescriptionIterator.class);
			pageContext.getOut().print(theEmail.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

