package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006HasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006HasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006HasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006HasNameIterator theBFO_0000006HasNameIterator = (BFO_0000006HasNameIterator)findAncestorWithClass(this, BFO_0000006HasNameIterator.class);
			pageContext.getOut().print(theBFO_0000006HasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for hasName tag ");
		}
		return SKIP_BODY;
	}
}
