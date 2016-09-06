package edu.uiowa.slis.VIVOISF.ERO_0000016;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000016ERO_0001518 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000016ERO_0001518 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000016ERO_0001518.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000016ERO_0001518Iterator theERO_0000016ERO_0001518Iterator = (ERO_0000016ERO_0001518Iterator)findAncestorWithClass(this, ERO_0000016ERO_0001518Iterator.class);
			pageContext.getOut().print(theERO_0000016ERO_0001518Iterator.getERO_0001518());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000016 for ERO_0001518 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000016 for ERO_0001518 tag ");
		}
		return SKIP_BODY;
	}
}

