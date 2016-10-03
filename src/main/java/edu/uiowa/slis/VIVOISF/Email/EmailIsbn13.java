package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailIsbn13Iterator theEmail = (EmailIsbn13Iterator)findAncestorWithClass(this, EmailIsbn13Iterator.class);
			pageContext.getOut().print(theEmail.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

