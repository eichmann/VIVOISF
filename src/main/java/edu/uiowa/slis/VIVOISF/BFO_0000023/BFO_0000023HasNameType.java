package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023HasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023HasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023HasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023HasNameIterator theBFO_0000023HasNameIterator = (BFO_0000023HasNameIterator)findAncestorWithClass(this, BFO_0000023HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000023HasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hasName tag ");
		}
		return SKIP_BODY;
	}
}

