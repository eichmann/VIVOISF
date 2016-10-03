package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePageEndIterator theClinicalGuideline = (ClinicalGuidelinePageEndIterator)findAncestorWithClass(this, ClinicalGuidelinePageEndIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

