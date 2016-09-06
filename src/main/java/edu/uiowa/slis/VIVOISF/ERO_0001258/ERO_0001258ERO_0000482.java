package edu.uiowa.slis.VIVOISF.ERO_0001258;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001258ERO_0000482 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001258ERO_0000482 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001258ERO_0000482.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001258ERO_0000482Iterator theERO_0001258ERO_0000482Iterator = (ERO_0001258ERO_0000482Iterator)findAncestorWithClass(this, ERO_0001258ERO_0000482Iterator.class);
			pageContext.getOut().print(theERO_0001258ERO_0000482Iterator.getERO_0000482());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001258 for ERO_0000482 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001258 for ERO_0000482 tag ");
		}
		return SKIP_BODY;
	}
}

