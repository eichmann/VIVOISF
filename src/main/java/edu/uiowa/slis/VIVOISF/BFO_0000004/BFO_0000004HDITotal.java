package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004HDITotalIterator theBFO_0000004 = (BFO_0000004HDITotalIterator)findAncestorWithClass(this, BFO_0000004HDITotalIterator.class);
			pageContext.getOut().print(theBFO_0000004.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

