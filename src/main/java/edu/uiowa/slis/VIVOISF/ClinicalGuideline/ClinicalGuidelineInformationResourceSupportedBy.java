package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineInformationResourceSupportedByIterator theClinicalGuidelineInformationResourceSupportedByIterator = (ClinicalGuidelineInformationResourceSupportedByIterator)findAncestorWithClass(this, ClinicalGuidelineInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theClinicalGuidelineInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

