package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002PageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002PageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002PageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002PageStartIterator theBFO_0000002 = (BFO_0000002PageStartIterator)findAncestorWithClass(this, BFO_0000002PageStartIterator.class);
			pageContext.getOut().print(theBFO_0000002.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

