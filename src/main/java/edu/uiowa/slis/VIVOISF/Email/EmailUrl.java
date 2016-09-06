package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailUrlIterator theEmail = (EmailUrlIterator)findAncestorWithClass(this, EmailUrlIterator.class);
			pageContext.getOut().print(theEmail.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for url tag ");
		}
		return SKIP_BODY;
	}
}

