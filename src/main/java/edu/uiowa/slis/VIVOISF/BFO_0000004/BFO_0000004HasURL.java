package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004HasURLIterator theBFO_0000004HasURLIterator = (BFO_0000004HasURLIterator)findAncestorWithClass(this, BFO_0000004HasURLIterator.class);
			pageContext.getOut().print(theBFO_0000004HasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

