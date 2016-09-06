package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardRO_0000056Iterator theStandardRO_0000056Iterator = (StandardRO_0000056Iterator)findAncestorWithClass(this, StandardRO_0000056Iterator.class);
			pageContext.getOut().print(theStandardRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

