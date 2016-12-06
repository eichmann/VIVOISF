package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasResearchAreaIterator thePositionHasResearchAreaIterator = (PositionHasResearchAreaIterator)findAncestorWithClass(this, PositionHasResearchAreaIterator.class);
			pageContext.getOut().print(thePositionHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

