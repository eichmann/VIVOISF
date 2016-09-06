package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023BFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023BFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023BFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023BFO_0000054Iterator theBFO_0000023BFO_0000054Iterator = (BFO_0000023BFO_0000054Iterator)findAncestorWithClass(this, BFO_0000023BFO_0000054Iterator.class);
			pageContext.getOut().print(theBFO_0000023BFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

