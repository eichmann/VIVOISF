package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIssuerIterator theClinicalGuidelineIssuerIterator = (ClinicalGuidelineIssuerIterator)findAncestorWithClass(this, ClinicalGuidelineIssuerIterator.class);
			pageContext.getOut().print(theClinicalGuidelineIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for issuer tag ");
		}
		return SKIP_BODY;
	}
}

