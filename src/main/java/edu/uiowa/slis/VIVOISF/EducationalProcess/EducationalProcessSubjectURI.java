package edu.uiowa.slis.VIVOISF.EducationalProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EducationalProcessSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EducationalProcessSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EducationalProcessSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			if (!theEducationalProcess.commitNeeded) {
				pageContext.getOut().print(theEducationalProcess.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			return theEducationalProcess.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EducationalProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EducationalProcess theEducationalProcess = (EducationalProcess)findAncestorWithClass(this, EducationalProcess.class);
			theEducationalProcess.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EducationalProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EducationalProcess for subjectURI tag ");
		}
	}
}

