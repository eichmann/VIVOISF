package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailReproducedInIterator theEmailReproducedInIterator = (EmailReproducedInIterator)findAncestorWithClass(this, EmailReproducedInIterator.class);
			pageContext.getOut().print(theEmailReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

