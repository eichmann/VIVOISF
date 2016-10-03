package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailRO_0000056Iterator theEmailRO_0000056Iterator = (EmailRO_0000056Iterator)findAncestorWithClass(this, EmailRO_0000056Iterator.class);
			pageContext.getOut().print(theEmailRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

