package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversitySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversitySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversitySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			if (!theUniversity.commitNeeded) {
				pageContext.getOut().print(theUniversity.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing University for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			return theUniversity.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing University for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			University theUniversity = (University)findAncestorWithClass(this, University.class);
			theUniversity.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing University for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for subjectURI tag ");
		}
	}
}

