package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailIAO_0000136Iterator theEmailIAO_0000136Iterator = (EmailIAO_0000136Iterator)findAncestorWithClass(this, EmailIAO_0000136Iterator.class);
			pageContext.getOut().print(theEmailIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

