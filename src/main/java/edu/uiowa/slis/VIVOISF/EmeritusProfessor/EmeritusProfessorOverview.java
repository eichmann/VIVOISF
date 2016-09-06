package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for overview tag ");
		}
	}
}

