package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailDoiIterator theEmail = (EmailDoiIterator)findAncestorWithClass(this, EmailDoiIterator.class);
			pageContext.getOut().print(theEmail.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for doi tag ");
		}
		return SKIP_BODY;
	}
}

