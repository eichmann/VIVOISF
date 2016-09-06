package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineHasTranslationIterator theClinicalGuidelineHasTranslationIterator = (ClinicalGuidelineHasTranslationIterator)findAncestorWithClass(this, ClinicalGuidelineHasTranslationIterator.class);
			pageContext.getOut().print(theClinicalGuidelineHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

