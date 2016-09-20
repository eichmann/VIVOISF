package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineERO_0000045Iterator theClinicalGuideline = (ClinicalGuidelineERO_0000045Iterator)findAncestorWithClass(this, ClinicalGuidelineERO_0000045Iterator.class);
			pageContext.getOut().print(theClinicalGuideline.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

