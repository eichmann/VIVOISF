package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasSubjectAreaIterator thePositionHasSubjectAreaIterator = (PositionHasSubjectAreaIterator)findAncestorWithClass(this, PositionHasSubjectAreaIterator.class);
			pageContext.getOut().print(thePositionHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

