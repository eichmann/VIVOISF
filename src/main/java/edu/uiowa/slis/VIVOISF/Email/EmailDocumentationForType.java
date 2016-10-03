package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailDocumentationForIterator theEmailDocumentationForIterator = (EmailDocumentationForIterator)findAncestorWithClass(this, EmailDocumentationForIterator.class);
			pageContext.getOut().print(theEmailDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

