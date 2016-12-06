package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031HasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031HasName currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031HasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031HasNameIterator theBFO_0000031HasNameIterator = (BFO_0000031HasNameIterator)findAncestorWithClass(this, BFO_0000031HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000031HasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

