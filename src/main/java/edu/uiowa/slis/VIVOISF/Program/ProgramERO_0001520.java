package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramERO_0001520 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramERO_0001520 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramERO_0001520.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramERO_0001520Iterator theProgramERO_0001520Iterator = (ProgramERO_0001520Iterator)findAncestorWithClass(this, ProgramERO_0001520Iterator.class);
			pageContext.getOut().print(theProgramERO_0001520Iterator.getERO_0001520());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for ERO_0001520 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for ERO_0001520 tag ");
		}
		return SKIP_BODY;
	}
}

