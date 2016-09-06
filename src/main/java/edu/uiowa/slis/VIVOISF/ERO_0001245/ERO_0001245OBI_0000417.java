package edu.uiowa.slis.VIVOISF.ERO_0001245;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001245OBI_0000417 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001245OBI_0000417 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001245OBI_0000417.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001245OBI_0000417Iterator theERO_0001245OBI_0000417Iterator = (ERO_0001245OBI_0000417Iterator)findAncestorWithClass(this, ERO_0001245OBI_0000417Iterator.class);
			pageContext.getOut().print(theERO_0001245OBI_0000417Iterator.getOBI_0000417());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001245 for OBI_0000417 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001245 for OBI_0000417 tag ");
		}
		return SKIP_BODY;
	}
}

