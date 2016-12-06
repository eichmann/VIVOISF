package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008HasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008HasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008HasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008HasURLIterator theBFO_0000008HasURLIterator = (BFO_0000008HasURLIterator)findAncestorWithClass(this, BFO_0000008HasURLIterator.class);
			pageContext.getOut().print(theBFO_0000008HasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for hasURL tag ");
		}
		return SKIP_BODY;
	}
}
