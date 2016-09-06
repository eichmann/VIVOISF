package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramGoverningAuthorityForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramGoverningAuthorityForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramGoverningAuthorityForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramGoverningAuthorityForIterator theProgramGoverningAuthorityForIterator = (ProgramGoverningAuthorityForIterator)findAncestorWithClass(this, ProgramGoverningAuthorityForIterator.class);
			pageContext.getOut().print(theProgramGoverningAuthorityForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for governingAuthorityFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for governingAuthorityFor tag ");
		}
		return SKIP_BODY;
	}
}

