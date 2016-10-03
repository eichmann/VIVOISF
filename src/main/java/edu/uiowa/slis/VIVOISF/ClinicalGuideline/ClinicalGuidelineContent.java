package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineContentIterator theClinicalGuideline = (ClinicalGuidelineContentIterator)findAncestorWithClass(this, ClinicalGuidelineContentIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for content tag ");
		}
		return SKIP_BODY;
	}
}

