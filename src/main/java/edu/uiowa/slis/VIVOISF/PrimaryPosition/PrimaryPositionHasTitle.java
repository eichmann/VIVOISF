package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasTitleIterator thePrimaryPositionHasTitleIterator = (PrimaryPositionHasTitleIterator)findAncestorWithClass(this, PrimaryPositionHasTitleIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

