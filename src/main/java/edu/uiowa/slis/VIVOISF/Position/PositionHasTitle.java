package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasTitleIterator thePositionHasTitleIterator = (PositionHasTitleIterator)findAncestorWithClass(this, PositionHasTitleIterator.class);
			pageContext.getOut().print(thePositionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

