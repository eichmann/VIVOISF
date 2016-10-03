package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailOclcnumIterator theEmail = (EmailOclcnumIterator)findAncestorWithClass(this, EmailOclcnumIterator.class);
			pageContext.getOut().print(theEmail.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

