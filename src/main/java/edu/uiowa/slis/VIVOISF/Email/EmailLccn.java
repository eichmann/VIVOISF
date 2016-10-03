package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailLccnIterator theEmail = (EmailLccnIterator)findAncestorWithClass(this, EmailLccnIterator.class);
			pageContext.getOut().print(theEmail.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for lccn tag ");
		}
		return SKIP_BODY;
	}
}

