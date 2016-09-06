package edu.uiowa.slis.VIVOISF.ERO_0001261;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001261RO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001261RO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001261RO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001261RO_0000056Iterator theERO_0001261RO_0000056Iterator = (ERO_0001261RO_0000056Iterator)findAncestorWithClass(this, ERO_0001261RO_0000056Iterator.class);
			pageContext.getOut().print(theERO_0001261RO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001261 for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001261 for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

