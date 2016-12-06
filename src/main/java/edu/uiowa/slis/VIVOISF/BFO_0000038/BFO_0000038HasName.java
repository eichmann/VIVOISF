package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038HasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038HasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038HasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038HasNameIterator theBFO_0000038HasNameIterator = (BFO_0000038HasNameIterator)findAncestorWithClass(this, BFO_0000038HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000038HasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

