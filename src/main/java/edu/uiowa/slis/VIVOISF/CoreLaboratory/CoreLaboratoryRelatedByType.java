package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryRelatedByIterator theCoreLaboratoryRelatedByIterator = (CoreLaboratoryRelatedByIterator)findAncestorWithClass(this, CoreLaboratoryRelatedByIterator.class);
			pageContext.getOut().print(theCoreLaboratoryRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

