package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			if (!theClinicalGuideline.commitNeeded) {
				pageContext.getOut().print(theClinicalGuideline.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			return theClinicalGuideline.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalGuideline for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			theClinicalGuideline.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for label tag ");
		}
	}
}

