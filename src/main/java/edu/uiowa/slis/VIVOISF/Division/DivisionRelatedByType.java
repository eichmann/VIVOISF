package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionRelatedByIterator theDivisionRelatedByIterator = (DivisionRelatedByIterator)findAncestorWithClass(this, DivisionRelatedByIterator.class);
			pageContext.getOut().print(theDivisionRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

