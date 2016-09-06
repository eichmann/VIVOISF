package edu.uiowa.slis.VIVOISF.EmeritusProfessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusProfessorGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusProfessorGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusProfessorGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusProfessorGeographicFocusIterator theEmeritusProfessorGeographicFocusIterator = (EmeritusProfessorGeographicFocusIterator)findAncestorWithClass(this, EmeritusProfessorGeographicFocusIterator.class);
			pageContext.getOut().print(theEmeritusProfessorGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusProfessor for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusProfessor for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

