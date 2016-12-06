package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IdentificationRelatedByIterator theIdentificationRelatedByIterator = (IdentificationRelatedByIterator)findAncestorWithClass(this, IdentificationRelatedByIterator.class);
			pageContext.getOut().print(theIdentificationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

