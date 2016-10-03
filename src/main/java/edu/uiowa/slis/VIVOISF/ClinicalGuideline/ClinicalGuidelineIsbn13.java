package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIsbn13Iterator theClinicalGuideline = (ClinicalGuidelineIsbn13Iterator)findAncestorWithClass(this, ClinicalGuidelineIsbn13Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

