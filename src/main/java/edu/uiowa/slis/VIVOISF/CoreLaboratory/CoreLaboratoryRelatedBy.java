package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryRelatedByIterator theCoreLaboratoryRelatedByIterator = (CoreLaboratoryRelatedByIterator)findAncestorWithClass(this, CoreLaboratoryRelatedByIterator.class);
			pageContext.getOut().print(theCoreLaboratoryRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

