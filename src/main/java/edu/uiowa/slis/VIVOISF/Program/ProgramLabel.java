package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			if (!theProgram.commitNeeded) {
				pageContext.getOut().print(theProgram.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Program for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			return theProgram.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Program for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			theProgram.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Program for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for label tag ");
		}
	}
}

