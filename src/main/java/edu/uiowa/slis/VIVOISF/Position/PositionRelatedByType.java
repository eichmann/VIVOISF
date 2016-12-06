package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionRelatedByIterator thePositionRelatedByIterator = (PositionRelatedByIterator)findAncestorWithClass(this, PositionRelatedByIterator.class);
			pageContext.getOut().print(thePositionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

