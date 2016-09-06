package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineReproducedInIterator theClinicalGuidelineReproducedInIterator = (ClinicalGuidelineReproducedInIterator)findAncestorWithClass(this, ClinicalGuidelineReproducedInIterator.class);
			pageContext.getOut().print(theClinicalGuidelineReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

