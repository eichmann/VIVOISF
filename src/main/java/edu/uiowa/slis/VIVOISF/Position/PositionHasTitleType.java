package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasTitleIterator thePositionHasTitleIterator = (PositionHasTitleIterator)findAncestorWithClass(this, PositionHasTitleIterator.class);
			pageContext.getOut().print(thePositionHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

