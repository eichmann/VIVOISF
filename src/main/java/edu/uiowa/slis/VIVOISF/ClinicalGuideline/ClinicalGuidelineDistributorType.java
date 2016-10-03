package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineDistributorIterator theClinicalGuidelineDistributorIterator = (ClinicalGuidelineDistributorIterator)findAncestorWithClass(this, ClinicalGuidelineDistributorIterator.class);
			pageContext.getOut().print(theClinicalGuidelineDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for distributor tag ");
		}
		return SKIP_BODY;
	}
}

