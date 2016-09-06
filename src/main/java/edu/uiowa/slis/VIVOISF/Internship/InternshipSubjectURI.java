package edu.uiowa.slis.VIVOISF.Internship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InternshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InternshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InternshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			if (!theInternship.commitNeeded) {
				pageContext.getOut().print(theInternship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			return theInternship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Internship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Internship theInternship = (Internship)findAncestorWithClass(this, Internship.class);
			theInternship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Internship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Internship for subjectURI tag ");
		}
	}
}

