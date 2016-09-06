package edu.uiowa.slis.VIVOISF.AcademicDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicDegreeAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicDegreeAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicDegreeAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			if (!theAcademicDegree.commitNeeded) {
				pageContext.getOut().print(theAcademicDegree.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			return theAcademicDegree.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			AcademicDegree theAcademicDegree = (AcademicDegree)findAncestorWithClass(this, AcademicDegree.class);
			theAcademicDegree.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicDegree for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicDegree for abbreviation tag ");
		}
	}
}

