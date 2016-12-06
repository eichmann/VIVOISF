package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008HasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008HasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008HasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008HasNameIterator theBFO_0000008HasNameIterator = (BFO_0000008HasNameIterator)findAncestorWithClass(this, BFO_0000008HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000008HasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

