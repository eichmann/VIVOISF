package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineNumPagesIterator theClinicalGuideline = (ClinicalGuidelineNumPagesIterator)findAncestorWithClass(this, ClinicalGuidelineNumPagesIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for numPages tag ");
		}
		return SKIP_BODY;
	}
}

