package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031BFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031BFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031BFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031BFO_0000050Iterator theBFO_0000031BFO_0000050Iterator = (BFO_0000031BFO_0000050Iterator)findAncestorWithClass(this, BFO_0000031BFO_0000050Iterator.class);
			pageContext.getOut().print(theBFO_0000031BFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

