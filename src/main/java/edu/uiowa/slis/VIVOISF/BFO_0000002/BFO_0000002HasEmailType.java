package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002HasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002HasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002HasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002HasEmailIterator theBFO_0000002HasEmailIterator = (BFO_0000002HasEmailIterator)findAncestorWithClass(this, BFO_0000002HasEmailIterator.class);
			pageContext.getOut().print(theBFO_0000002HasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

