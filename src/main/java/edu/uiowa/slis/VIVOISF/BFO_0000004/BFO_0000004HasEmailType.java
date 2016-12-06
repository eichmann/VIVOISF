package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004HasEmailIterator theBFO_0000004HasEmailIterator = (BFO_0000004HasEmailIterator)findAncestorWithClass(this, BFO_0000004HasEmailIterator.class);
			pageContext.getOut().print(theBFO_0000004HasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

