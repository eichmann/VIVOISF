package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailIsbn10Iterator theEmail = (EmailIsbn10Iterator)findAncestorWithClass(this, EmailIsbn10Iterator.class);
			pageContext.getOut().print(theEmail.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

