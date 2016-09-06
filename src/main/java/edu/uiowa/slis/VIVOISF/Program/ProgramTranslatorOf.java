package edu.uiowa.slis.VIVOISF.Program;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProgramTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProgramTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ProgramTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProgramTranslatorOfIterator theProgramTranslatorOfIterator = (ProgramTranslatorOfIterator)findAncestorWithClass(this, ProgramTranslatorOfIterator.class);
			pageContext.getOut().print(theProgramTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Program for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Program for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

