package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			if (!theProgram.commitNeeded) {
				pageContext.getOut().print(theProgram.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Program for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			return theProgram.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Program for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Program theProgram = (Program)findAncestorWithClass(this, Program.class);
			theProgram.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Program for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for overview tag ");
		}
	}
}

