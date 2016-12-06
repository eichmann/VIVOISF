package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionRelatedByIterator thePrimaryPositionRelatedByIterator = (PrimaryPositionRelatedByIterator)findAncestorWithClass(this, PrimaryPositionRelatedByIterator.class);
			pageContext.getOut().print(thePrimaryPositionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

