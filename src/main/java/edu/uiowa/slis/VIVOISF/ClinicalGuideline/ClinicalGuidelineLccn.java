package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineLccnIterator theClinicalGuideline = (ClinicalGuidelineLccnIterator)findAncestorWithClass(this, ClinicalGuidelineLccnIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for lccn tag ");
		}
		return SKIP_BODY;
	}
}

