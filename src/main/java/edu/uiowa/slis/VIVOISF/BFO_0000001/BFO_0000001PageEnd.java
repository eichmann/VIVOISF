package edu.uiowa.slis.VIVOISF.BFO_0000001;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000001PageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000001PageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000001PageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000001PageEndIterator theBFO_0000001 = (BFO_0000001PageEndIterator)findAncestorWithClass(this, BFO_0000001PageEndIterator.class);
			pageContext.getOut().print(theBFO_0000001.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000001 for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000001 for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

