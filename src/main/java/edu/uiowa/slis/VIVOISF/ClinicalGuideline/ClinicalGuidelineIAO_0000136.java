package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuidelineIAO_0000136Iterator theClinicalGuidelineIAO_0000136Iterator = (ClinicalGuidelineIAO_0000136Iterator)findAncestorWithClass(this, ClinicalGuidelineIAO_0000136Iterator.class);
			pageContext.getOut().print(theClinicalGuidelineIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

