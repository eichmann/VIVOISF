package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineShortDescriptionIterator theClinicalGuideline = (ClinicalGuidelineShortDescriptionIterator)findAncestorWithClass(this, ClinicalGuidelineShortDescriptionIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

