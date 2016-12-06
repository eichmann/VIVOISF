package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031RO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031RO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031RO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031RO_0001025Iterator theBFO_0000031RO_0001025Iterator = (BFO_0000031RO_0001025Iterator)findAncestorWithClass(this, BFO_0000031RO_0001025Iterator.class);
			pageContext.getOut().print(theBFO_0000031RO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

