package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineOclcnumIterator theClinicalGuideline = (ClinicalGuidelineOclcnumIterator)findAncestorWithClass(this, ClinicalGuidelineOclcnumIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

