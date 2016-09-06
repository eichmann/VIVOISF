package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for researchOverview tag ");
		}
	}
}

