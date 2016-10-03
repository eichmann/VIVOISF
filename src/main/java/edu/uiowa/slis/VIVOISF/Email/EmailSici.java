package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailSici currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailSiciIterator theEmail = (EmailSiciIterator)findAncestorWithClass(this, EmailSiciIterator.class);
			pageContext.getOut().print(theEmail.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for sici tag ");
		}
		return SKIP_BODY;
	}
}

