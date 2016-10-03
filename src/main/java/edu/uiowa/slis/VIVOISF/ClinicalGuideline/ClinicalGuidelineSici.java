package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineSiciIterator theClinicalGuideline = (ClinicalGuidelineSiciIterator)findAncestorWithClass(this, ClinicalGuidelineSiciIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for sici tag ");
		}
		return SKIP_BODY;
	}
}

