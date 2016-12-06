package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasResearchAreaIterator thePrimaryPositionHasResearchAreaIterator = (PrimaryPositionHasResearchAreaIterator)findAncestorWithClass(this, PrimaryPositionHasResearchAreaIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

