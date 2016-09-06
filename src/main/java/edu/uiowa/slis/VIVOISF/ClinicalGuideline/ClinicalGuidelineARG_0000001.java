package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineARG_0000001Iterator theClinicalGuideline = (ClinicalGuidelineARG_0000001Iterator)findAncestorWithClass(this, ClinicalGuidelineARG_0000001Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

