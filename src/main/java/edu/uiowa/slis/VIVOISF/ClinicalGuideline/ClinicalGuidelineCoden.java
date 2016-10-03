package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineCodenIterator theClinicalGuideline = (ClinicalGuidelineCodenIterator)findAncestorWithClass(this, ClinicalGuidelineCodenIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for coden tag ");
		}
		return SKIP_BODY;
	}
}

