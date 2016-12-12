package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031NumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031NumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031NumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031NumPagesIterator theBFO_0000031 = (BFO_0000031NumPagesIterator)findAncestorWithClass(this, BFO_0000031NumPagesIterator.class);
			pageContext.getOut().print(theBFO_0000031.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for numPages tag ");
		}
		return SKIP_BODY;
	}
}

