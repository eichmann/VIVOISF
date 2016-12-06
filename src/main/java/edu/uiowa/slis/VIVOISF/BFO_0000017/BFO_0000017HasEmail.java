package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017HasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017HasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017HasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017HasEmailIterator theBFO_0000017HasEmailIterator = (BFO_0000017HasEmailIterator)findAncestorWithClass(this, BFO_0000017HasEmailIterator.class);
			pageContext.getOut().print(theBFO_0000017HasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

