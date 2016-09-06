package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for teachingOverview tag ");
		}
	}
}

