package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565ERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565ERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565ERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565ERO_0001520Iterator theERO_0000565ERO_0001520Iterator = (ERO_0000565ERO_0001520Iterator)findAncestorWithClass(this, ERO_0000565ERO_0001520Iterator.class);
			pageContext.getOut().print(theERO_0000565ERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

