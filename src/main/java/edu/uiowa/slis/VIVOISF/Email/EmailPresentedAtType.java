package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailPresentedAtIterator theEmailPresentedAtIterator = (EmailPresentedAtIterator)findAncestorWithClass(this, EmailPresentedAtIterator.class);
			pageContext.getOut().print(theEmailPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

