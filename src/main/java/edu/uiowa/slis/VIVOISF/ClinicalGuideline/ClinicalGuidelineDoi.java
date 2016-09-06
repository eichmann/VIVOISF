package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineDoiIterator theClinicalGuideline = (ClinicalGuidelineDoiIterator)findAncestorWithClass(this, ClinicalGuidelineDoiIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for doi tag ");
		}
		return SKIP_BODY;
	}
}

