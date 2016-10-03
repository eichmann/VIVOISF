package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailDistributorIterator theEmailDistributorIterator = (EmailDistributorIterator)findAncestorWithClass(this, EmailDistributorIterator.class);
			pageContext.getOut().print(theEmailDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for distributor tag ");
		}
		return SKIP_BODY;
	}
}

