package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineCitesIterator theClinicalGuidelineCitesIterator = (ClinicalGuidelineCitesIterator)findAncestorWithClass(this, ClinicalGuidelineCitesIterator.class);
			pageContext.getOut().print(theClinicalGuidelineCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for cites tag ");
		}
		return SKIP_BODY;
	}
}

