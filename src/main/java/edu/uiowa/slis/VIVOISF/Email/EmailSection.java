package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailSection currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailSectionIterator theEmail = (EmailSectionIterator)findAncestorWithClass(this, EmailSectionIterator.class);
			pageContext.getOut().print(theEmail.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for section tag ");
		}
		return SKIP_BODY;
	}
}

