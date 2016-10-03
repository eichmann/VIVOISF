package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailTranslatorIterator theEmailTranslatorIterator = (EmailTranslatorIterator)findAncestorWithClass(this, EmailTranslatorIterator.class);
			pageContext.getOut().print(theEmailTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for translator tag ");
		}
		return SKIP_BODY;
	}
}

