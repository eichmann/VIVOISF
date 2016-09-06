package edu.uiowa.slis.VIVOISF.ClinicalGuideline;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClinicalGuidelineSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ClinicalGuidelineSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ClinicalGuidelineSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			if (!theClinicalGuideline.commitNeeded) {
				pageContext.getOut().print(theClinicalGuideline.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			return theClinicalGuideline.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ClinicalGuideline for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ClinicalGuideline theClinicalGuideline = (ClinicalGuideline)findAncestorWithClass(this, ClinicalGuideline.class);
			theClinicalGuideline.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ClinicalGuideline for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ClinicalGuideline for subjectURI tag ");
		}
	}
}

