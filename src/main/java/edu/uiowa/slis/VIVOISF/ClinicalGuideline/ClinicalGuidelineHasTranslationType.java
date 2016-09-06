package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineHasTranslationIterator theClinicalGuidelineHasTranslationIterator = (ClinicalGuidelineHasTranslationIterator)findAncestorWithClass(this, ClinicalGuidelineHasTranslationIterator.class);
			pageContext.getOut().print(theClinicalGuidelineHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

