package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002PageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002PageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002PageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002PageEndIterator theBFO_0000002 = (BFO_0000002PageEndIterator)findAncestorWithClass(this, BFO_0000002PageEndIterator.class);
			pageContext.getOut().print(theBFO_0000002.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

