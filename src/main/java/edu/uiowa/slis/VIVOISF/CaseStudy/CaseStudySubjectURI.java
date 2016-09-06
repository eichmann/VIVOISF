package edu.uiowa.slis.VIVOISF.CaseStudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CaseStudySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CaseStudySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CaseStudySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			if (!theCaseStudy.commitNeeded) {
				pageContext.getOut().print(theCaseStudy.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			return theCaseStudy.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CaseStudy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CaseStudy theCaseStudy = (CaseStudy)findAncestorWithClass(this, CaseStudy.class);
			theCaseStudy.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CaseStudy for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CaseStudy for subjectURI tag ");
		}
	}
}

