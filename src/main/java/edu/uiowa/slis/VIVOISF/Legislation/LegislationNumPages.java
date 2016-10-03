package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationNumPagesIterator theLegislation = (LegislationNumPagesIterator)findAncestorWithClass(this, LegislationNumPagesIterator.class);
			pageContext.getOut().print(theLegislation.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for numPages tag ");
		}
		return SKIP_BODY;
	}
}

