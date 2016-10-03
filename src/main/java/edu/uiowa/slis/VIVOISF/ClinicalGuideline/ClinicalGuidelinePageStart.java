package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePageStartIterator theClinicalGuideline = (ClinicalGuidelinePageStartIterator)findAncestorWithClass(this, ClinicalGuidelinePageStartIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

