package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017HasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017HasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017HasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017HasURLIterator theBFO_0000017HasURLIterator = (BFO_0000017HasURLIterator)findAncestorWithClass(this, BFO_0000017HasURLIterator.class);
			pageContext.getOut().print(theBFO_0000017HasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

