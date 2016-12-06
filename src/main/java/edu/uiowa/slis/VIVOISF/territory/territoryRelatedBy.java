package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRelatedByIterator theterritoryRelatedByIterator = (territoryRelatedByIterator)findAncestorWithClass(this, territoryRelatedByIterator.class);
			pageContext.getOut().print(theterritoryRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

