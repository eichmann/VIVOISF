package edu.uiowa.slis.VIVOISF.ERO_0000014;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000014ERO_0000919Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000014ERO_0000919Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000014ERO_0000919Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000014ERO_0000919Iterator theERO_0000014ERO_0000919Iterator = (ERO_0000014ERO_0000919Iterator)findAncestorWithClass(this, ERO_0000014ERO_0000919Iterator.class);
			pageContext.getOut().print(theERO_0000014ERO_0000919Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000014 for ERO_0000919 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000014 for ERO_0000919 tag ");
		}
		return SKIP_BODY;
	}
}

