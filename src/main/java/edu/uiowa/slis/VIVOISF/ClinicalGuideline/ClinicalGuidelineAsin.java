package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineAsinIterator theClinicalGuideline = (ClinicalGuidelineAsinIterator)findAncestorWithClass(this, ClinicalGuidelineAsinIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for asin tag ");
		}
		return SKIP_BODY;
	}
}

