package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailReproducesIterator theEmailReproducesIterator = (EmailReproducesIterator)findAncestorWithClass(this, EmailReproducesIterator.class);
			pageContext.getOut().print(theEmailReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

