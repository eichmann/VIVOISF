package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineProducerIterator theClinicalGuidelineProducerIterator = (ClinicalGuidelineProducerIterator)findAncestorWithClass(this, ClinicalGuidelineProducerIterator.class);
			pageContext.getOut().print(theClinicalGuidelineProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for producer tag ");
		}
		return SKIP_BODY;
	}
}

