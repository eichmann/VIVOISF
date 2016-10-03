package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationPages currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationPagesIterator theLegislation = (LegislationPagesIterator)findAncestorWithClass(this, LegislationPagesIterator.class);
			pageContext.getOut().print(theLegislation.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for pages tag ");
		}
		return SKIP_BODY;
	}
}

