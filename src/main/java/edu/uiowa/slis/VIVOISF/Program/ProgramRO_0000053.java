package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramRO_0000053Iterator theProgramRO_0000053Iterator = (ProgramRO_0000053Iterator)findAncestorWithClass(this, ProgramRO_0000053Iterator.class);
			pageContext.getOut().print(theProgramRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

