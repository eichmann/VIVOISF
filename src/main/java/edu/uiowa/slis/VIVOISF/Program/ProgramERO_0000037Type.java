package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramERO_0000037Iterator theProgramERO_0000037Iterator = (ProgramERO_0000037Iterator)findAncestorWithClass(this, ProgramERO_0000037Iterator.class);
			pageContext.getOut().print(theProgramERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

