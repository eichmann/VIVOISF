package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasSubjectAreaIterator thePrimaryPositionHasSubjectAreaIterator = (PrimaryPositionHasSubjectAreaIterator)findAncestorWithClass(this, PrimaryPositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

