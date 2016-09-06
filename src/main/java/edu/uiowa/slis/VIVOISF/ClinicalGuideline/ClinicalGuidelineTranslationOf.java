package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineTranslationOfIterator theClinicalGuidelineTranslationOfIterator = (ClinicalGuidelineTranslationOfIterator)findAncestorWithClass(this, ClinicalGuidelineTranslationOfIterator.class);
			pageContext.getOut().print(theClinicalGuidelineTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

