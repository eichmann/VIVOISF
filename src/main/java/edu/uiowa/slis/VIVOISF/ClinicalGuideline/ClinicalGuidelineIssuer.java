package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIssuerIterator theClinicalGuidelineIssuerIterator = (ClinicalGuidelineIssuerIterator)findAncestorWithClass(this, ClinicalGuidelineIssuerIterator.class);
			pageContext.getOut().print(theClinicalGuidelineIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for issuer tag ");
		}
		return SKIP_BODY;
	}
}

