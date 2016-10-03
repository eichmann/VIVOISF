package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailCitesIterator theEmailCitesIterator = (EmailCitesIterator)findAncestorWithClass(this, EmailCitesIterator.class);
			pageContext.getOut().print(theEmailCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for cites tag ");
		}
		return SKIP_BODY;
	}
}

