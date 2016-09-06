package edu.uiowa.slis.VIVOISF.Gender;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GenderSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GenderSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GenderSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			if (!theGender.commitNeeded) {
				pageContext.getOut().print(theGender.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Gender for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			return theGender.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Gender for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Gender theGender = (Gender)findAncestorWithClass(this, Gender.class);
			theGender.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Gender for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Gender for subjectURI tag ");
		}
	}
}

