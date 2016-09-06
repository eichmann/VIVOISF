package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			if (!theProgram.commitNeeded) {
				pageContext.getOut().print(theProgram.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Program for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			return theProgram.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Program for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			theProgram.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Program for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for subjectURI tag ");
		}
	}
}

