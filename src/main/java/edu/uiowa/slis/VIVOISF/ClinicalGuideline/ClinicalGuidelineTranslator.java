package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineTranslatorIterator theClinicalGuidelineTranslatorIterator = (ClinicalGuidelineTranslatorIterator)findAncestorWithClass(this, ClinicalGuidelineTranslatorIterator.class);
			pageContext.getOut().print(theClinicalGuidelineTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for translator tag ");
		}
		return SKIP_BODY;
	}
}

