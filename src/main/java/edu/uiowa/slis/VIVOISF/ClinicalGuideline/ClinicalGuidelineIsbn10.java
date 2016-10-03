package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIsbn10Iterator theClinicalGuideline = (ClinicalGuidelineIsbn10Iterator)findAncestorWithClass(this, ClinicalGuidelineIsbn10Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

