package edu.uiowa.slis.VIVOISF.Grant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GrantRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GrantRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(GrantRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GrantRO_0000056Iterator theGrantRO_0000056Iterator = (GrantRO_0000056Iterator)findAncestorWithClass(this, GrantRO_0000056Iterator.class);
			pageContext.getOut().print(theGrantRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Grant for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Grant for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

