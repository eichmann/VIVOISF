package edu.uiowa.slis.VIVOISF.BFO_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000017HasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000017HasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000017HasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000017HasResearchAreaIterator theBFO_0000017HasResearchAreaIterator = (BFO_0000017HasResearchAreaIterator)findAncestorWithClass(this, BFO_0000017HasResearchAreaIterator.class);
			pageContext.getOut().print(theBFO_0000017HasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000017 for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000017 for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}
