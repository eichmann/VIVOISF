package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailRelatesIterator theEmailRelatesIterator = (EmailRelatesIterator)findAncestorWithClass(this, EmailRelatesIterator.class);
			pageContext.getOut().print(theEmailRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for relates tag ");
		}
		return SKIP_BODY;
	}
}

