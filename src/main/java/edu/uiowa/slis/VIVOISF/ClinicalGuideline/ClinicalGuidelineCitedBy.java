package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineCitedByIterator theClinicalGuidelineCitedByIterator = (ClinicalGuidelineCitedByIterator)findAncestorWithClass(this, ClinicalGuidelineCitedByIterator.class);
			pageContext.getOut().print(theClinicalGuidelineCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

