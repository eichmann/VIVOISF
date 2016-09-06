package edu.uiowa.slis.VIVOISF.BFO_0000034;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000034BFO_0000054 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000034BFO_0000054 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000034BFO_0000054.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000034BFO_0000054Iterator theBFO_0000034BFO_0000054Iterator = (BFO_0000034BFO_0000054Iterator)findAncestorWithClass(this, BFO_0000034BFO_0000054Iterator.class);
			pageContext.getOut().print(theBFO_0000034BFO_0000054Iterator.getBFO_0000054());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000034 for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000034 for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

