package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			if (!theEmeritusProfessor.commitNeeded) {
				pageContext.getOut().print(theEmeritusProfessor.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			return theEmeritusProfessor.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusProfessor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EmeritusProfessor theEmeritusProfessor = (EmeritusProfessor)findAncestorWithClass(this, EmeritusProfessor.class);
			theEmeritusProfessor.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for label tag ");
		}
	}
}

