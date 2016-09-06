package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for outreachOverview tag ");
		}
	}
}

