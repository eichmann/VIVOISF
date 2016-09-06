package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramERO_0000031Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramERO_0000031Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramERO_0000031Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramERO_0000031Iterator theProgramERO_0000031Iterator = (ProgramERO_0000031Iterator)findAncestorWithClass(this, ProgramERO_0000031Iterator.class);
			pageContext.getOut().print(theProgramERO_0000031Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for ERO_0000031 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for ERO_0000031 tag ");
		}
		return SKIP_BODY;
	}
}

