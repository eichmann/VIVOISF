package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailGtin14Iterator theEmail = (EmailGtin14Iterator)findAncestorWithClass(this, EmailGtin14Iterator.class);
			pageContext.getOut().print(theEmail.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

