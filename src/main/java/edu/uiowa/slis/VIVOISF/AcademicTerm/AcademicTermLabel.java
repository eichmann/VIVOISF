package edu.uiowa.slis.VIVOISF.AcademicTerm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AcademicTermLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AcademicTermLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AcademicTermLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			if (!theAcademicTerm.commitNeeded) {
				pageContext.getOut().print(theAcademicTerm.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			return theAcademicTerm.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AcademicTerm for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AcademicTerm theAcademicTerm = (AcademicTerm)findAncestorWithClass(this, AcademicTerm.class);
			theAcademicTerm.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AcademicTerm for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AcademicTerm for label tag ");
		}
	}
}

