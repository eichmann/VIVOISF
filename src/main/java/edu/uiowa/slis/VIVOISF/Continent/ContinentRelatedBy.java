package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRelatedByIterator theContinentRelatedByIterator = (ContinentRelatedByIterator)findAncestorWithClass(this, ContinentRelatedByIterator.class);
			pageContext.getOut().print(theContinentRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

