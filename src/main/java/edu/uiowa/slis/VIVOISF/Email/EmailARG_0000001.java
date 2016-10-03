package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailARG_0000001Iterator theEmail = (EmailARG_0000001Iterator)findAncestorWithClass(this, EmailARG_0000001Iterator.class);
			pageContext.getOut().print(theEmail.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

