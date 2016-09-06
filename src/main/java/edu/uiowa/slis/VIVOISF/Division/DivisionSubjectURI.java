package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			if (!theDivision.commitNeeded) {
				pageContext.getOut().print(theDivision.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Division for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			return theDivision.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Division for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Division theDivision = (Division)findAncestorWithClass(this, Division.class);
			theDivision.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Division for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for subjectURI tag ");
		}
	}
}

