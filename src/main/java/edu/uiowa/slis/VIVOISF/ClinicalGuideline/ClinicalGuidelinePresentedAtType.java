package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePresentedAtIterator theClinicalGuidelinePresentedAtIterator = (ClinicalGuidelinePresentedAtIterator)findAncestorWithClass(this, ClinicalGuidelinePresentedAtIterator.class);
			pageContext.getOut().print(theClinicalGuidelinePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

