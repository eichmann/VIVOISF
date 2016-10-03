package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailCites currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailCitesIterator theEmailCitesIterator = (EmailCitesIterator)findAncestorWithClass(this, EmailCitesIterator.class);
			pageContext.getOut().print(theEmailCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for cites tag ");
		}
		return SKIP_BODY;
	}
}

