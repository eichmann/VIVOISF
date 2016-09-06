package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for subjectURI tag ");
		}
	}
}

