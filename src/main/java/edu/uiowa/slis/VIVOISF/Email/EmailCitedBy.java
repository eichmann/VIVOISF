package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailCitedByIterator theEmailCitedByIterator = (EmailCitedByIterator)findAncestorWithClass(this, EmailCitedByIterator.class);
			pageContext.getOut().print(theEmailCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

