package edu.uiowa.slis.VIVOISF.ERO_0000014;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000014BFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000014BFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000014BFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000014BFO_0000055Iterator theERO_0000014BFO_0000055Iterator = (ERO_0000014BFO_0000055Iterator)findAncestorWithClass(this, ERO_0000014BFO_0000055Iterator.class);
			pageContext.getOut().print(theERO_0000014BFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000014 for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000014 for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

