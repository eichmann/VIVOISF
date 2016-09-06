package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			if (!theInstitute.commitNeeded) {
				pageContext.getOut().print(theInstitute.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			return theInstitute.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Institute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Institute theInstitute = (Institute)findAncestorWithClass(this, Institute.class);
			theInstitute.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for subjectURI tag ");
		}
	}
}

