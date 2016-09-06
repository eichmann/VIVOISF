package edu.uiowa.slis.VIVOISF.ERO_0001256;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001256ERO_0000482Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001256ERO_0000482Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001256ERO_0000482Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001256ERO_0000482Iterator theERO_0001256ERO_0000482Iterator = (ERO_0001256ERO_0000482Iterator)findAncestorWithClass(this, ERO_0001256ERO_0000482Iterator.class);
			pageContext.getOut().print(theERO_0001256ERO_0000482Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001256 for ERO_0000482 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001256 for ERO_0000482 tag ");
		}
		return SKIP_BODY;
	}
}

