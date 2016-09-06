package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedRO_0000056Iterator thedisputedRO_0000056Iterator = (disputedRO_0000056Iterator)findAncestorWithClass(this, disputedRO_0000056Iterator.class);
			pageContext.getOut().print(thedisputedRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

