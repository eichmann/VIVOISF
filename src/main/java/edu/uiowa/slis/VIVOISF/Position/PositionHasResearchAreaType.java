package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasResearchAreaIterator thePositionHasResearchAreaIterator = (PositionHasResearchAreaIterator)findAncestorWithClass(this, PositionHasResearchAreaIterator.class);
			pageContext.getOut().print(thePositionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

