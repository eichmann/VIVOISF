package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineFeaturesIterator theClinicalGuidelineFeaturesIterator = (ClinicalGuidelineFeaturesIterator)findAncestorWithClass(this, ClinicalGuidelineFeaturesIterator.class);
			pageContext.getOut().print(theClinicalGuidelineFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for features tag ");
		}
		return SKIP_BODY;
	}
}

