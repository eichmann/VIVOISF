package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ContinentRelatedByIterator theContinentRelatedByIterator = (ContinentRelatedByIterator)findAncestorWithClass(this, ContinentRelatedByIterator.class);
			pageContext.getOut().print(theContinentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

