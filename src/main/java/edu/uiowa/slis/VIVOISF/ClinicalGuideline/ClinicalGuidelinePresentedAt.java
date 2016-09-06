package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePresentedAtIterator theClinicalGuidelinePresentedAtIterator = (ClinicalGuidelinePresentedAtIterator)findAncestorWithClass(this, ClinicalGuidelinePresentedAtIterator.class);
			pageContext.getOut().print(theClinicalGuidelinePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

