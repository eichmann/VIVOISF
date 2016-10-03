package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePages currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePagesIterator theClinicalGuideline = (ClinicalGuidelinePagesIterator)findAncestorWithClass(this, ClinicalGuidelinePagesIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for pages tag ");
		}
		return SKIP_BODY;
	}
}

