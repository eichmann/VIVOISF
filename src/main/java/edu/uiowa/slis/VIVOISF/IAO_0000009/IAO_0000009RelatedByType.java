package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009RelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009RelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009RelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009RelatedByIterator theIAO_0000009RelatedByIterator = (IAO_0000009RelatedByIterator)findAncestorWithClass(this, IAO_0000009RelatedByIterator.class);
			pageContext.getOut().print(theIAO_0000009RelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

