package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionDescriptionIterator thePrimaryPosition = (PrimaryPositionDescriptionIterator)findAncestorWithClass(this, PrimaryPositionDescriptionIterator.class);
			pageContext.getOut().print(thePrimaryPosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for description tag ");
		}
		return SKIP_BODY;
	}
}

