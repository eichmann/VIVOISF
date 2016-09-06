package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelinePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelinePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelinePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelinePmidIterator theClinicalGuideline = (ClinicalGuidelinePmidIterator)findAncestorWithClass(this, ClinicalGuidelinePmidIterator.class);
			pageContext.getOut().print(theClinicalGuideline.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for pmid tag ");
		}
		return SKIP_BODY;
	}
}

