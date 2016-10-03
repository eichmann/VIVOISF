package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineSectionIterator theClinicalGuideline = (ClinicalGuidelineSectionIterator)findAncestorWithClass(this, ClinicalGuidelineSectionIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for section tag ");
		}
		return SKIP_BODY;
	}
}

