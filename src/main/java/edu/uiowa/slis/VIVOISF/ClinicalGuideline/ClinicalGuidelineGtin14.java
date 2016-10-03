package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineGtin14Iterator theClinicalGuideline = (ClinicalGuidelineGtin14Iterator)findAncestorWithClass(this, ClinicalGuidelineGtin14Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

