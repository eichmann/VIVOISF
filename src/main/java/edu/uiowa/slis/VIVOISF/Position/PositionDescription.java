package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PositionDescriptionIterator thePosition = (PositionDescriptionIterator)findAncestorWithClass(this, PositionDescriptionIterator.class);
			pageContext.getOut().print(thePosition.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for description tag ");
		}
		return SKIP_BODY;
	}
}

