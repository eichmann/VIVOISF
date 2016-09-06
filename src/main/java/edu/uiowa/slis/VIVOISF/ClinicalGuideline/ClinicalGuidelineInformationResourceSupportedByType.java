package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineInformationResourceSupportedByIterator theClinicalGuidelineInformationResourceSupportedByIterator = (ClinicalGuidelineInformationResourceSupportedByIterator)findAncestorWithClass(this, ClinicalGuidelineInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theClinicalGuidelineInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

