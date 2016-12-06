package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015HasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015HasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015HasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015HasURLIterator theBFO_0000015HasURLIterator = (BFO_0000015HasURLIterator)findAncestorWithClass(this, BFO_0000015HasURLIterator.class);
			pageContext.getOut().print(theBFO_0000015HasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

