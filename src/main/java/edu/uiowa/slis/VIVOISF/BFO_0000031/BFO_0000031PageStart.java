package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031PageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031PageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031PageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031PageStartIterator theBFO_0000031 = (BFO_0000031PageStartIterator)findAncestorWithClass(this, BFO_0000031PageStartIterator.class);
			pageContext.getOut().print(theBFO_0000031.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

