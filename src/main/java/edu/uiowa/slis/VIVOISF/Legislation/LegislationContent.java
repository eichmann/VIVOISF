package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationContent currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationContentIterator theLegislation = (LegislationContentIterator)findAncestorWithClass(this, LegislationContentIterator.class);
			pageContext.getOut().print(theLegislation.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for content tag ");
		}
		return SKIP_BODY;
	}
}

