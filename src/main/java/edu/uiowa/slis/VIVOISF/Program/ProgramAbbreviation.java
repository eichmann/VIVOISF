package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			if (!theProgram.commitNeeded) {
				pageContext.getOut().print(theProgram.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Program for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			return theProgram.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Program for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			theProgram.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Program for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for abbreviation tag ");
		}
	}
}

