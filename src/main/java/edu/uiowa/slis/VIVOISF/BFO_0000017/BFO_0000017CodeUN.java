package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017CodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017CodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017CodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017CodeUNIterator theBFO_0000017 = (BFO_0000017CodeUNIterator)findAncestorWithClass(this, BFO_0000017CodeUNIterator.class);
			pageContext.getOut().print(theBFO_0000017.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

