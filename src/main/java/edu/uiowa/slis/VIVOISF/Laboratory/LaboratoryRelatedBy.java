package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryRelatedByIterator theLaboratoryRelatedByIterator = (LaboratoryRelatedByIterator)findAncestorWithClass(this, LaboratoryRelatedByIterator.class);
			pageContext.getOut().print(theLaboratoryRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

