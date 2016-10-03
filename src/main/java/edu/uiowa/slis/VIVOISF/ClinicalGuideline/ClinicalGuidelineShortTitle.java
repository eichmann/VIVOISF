package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineShortTitleIterator theClinicalGuideline = (ClinicalGuidelineShortTitleIterator)findAncestorWithClass(this, ClinicalGuidelineShortTitleIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

