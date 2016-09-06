package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			if (!theSchool.commitNeeded) {
				pageContext.getOut().print(theSchool.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing School for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			return theSchool.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing School for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			School theSchool = (School)findAncestorWithClass(this, School.class);
			theSchool.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing School for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for subjectURI tag ");
		}
	}
}

