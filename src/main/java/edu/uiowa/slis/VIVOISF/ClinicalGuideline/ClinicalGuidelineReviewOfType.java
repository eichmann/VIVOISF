package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineReviewOfIterator theClinicalGuidelineReviewOfIterator = (ClinicalGuidelineReviewOfIterator)findAncestorWithClass(this, ClinicalGuidelineReviewOfIterator.class);
			pageContext.getOut().print(theClinicalGuidelineReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

