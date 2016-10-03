package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineEanucc13Iterator theClinicalGuideline = (ClinicalGuidelineEanucc13Iterator)findAncestorWithClass(this, ClinicalGuidelineEanucc13Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

