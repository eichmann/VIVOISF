package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031RO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031RO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031RO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031RO_0001015Iterator theBFO_0000031RO_0001015Iterator = (BFO_0000031RO_0001015Iterator)findAncestorWithClass(this, BFO_0000031RO_0001015Iterator.class);
			pageContext.getOut().print(theBFO_0000031RO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

