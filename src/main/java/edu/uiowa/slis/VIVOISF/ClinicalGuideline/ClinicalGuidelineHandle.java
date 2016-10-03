package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineHandleIterator theClinicalGuideline = (ClinicalGuidelineHandleIterator)findAncestorWithClass(this, ClinicalGuidelineHandleIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for handle tag ");
		}
		return SKIP_BODY;
	}
}

