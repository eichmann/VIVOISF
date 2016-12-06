package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030RelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030RelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030RelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030RelatedByIterator theIAO_0000030RelatedByIterator = (IAO_0000030RelatedByIterator)findAncestorWithClass(this, IAO_0000030RelatedByIterator.class);
			pageContext.getOut().print(theIAO_0000030RelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

