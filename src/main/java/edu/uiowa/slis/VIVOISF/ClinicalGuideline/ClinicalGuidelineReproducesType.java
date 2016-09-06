package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineReproducesIterator theClinicalGuidelineReproducesIterator = (ClinicalGuidelineReproducesIterator)findAncestorWithClass(this, ClinicalGuidelineReproducesIterator.class);
			pageContext.getOut().print(theClinicalGuidelineReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

