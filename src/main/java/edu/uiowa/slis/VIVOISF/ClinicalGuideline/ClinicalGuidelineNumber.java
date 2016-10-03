package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineNumberIterator theClinicalGuideline = (ClinicalGuidelineNumberIterator)findAncestorWithClass(this, ClinicalGuidelineNumberIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for number tag ");
		}
		return SKIP_BODY;
	}
}

