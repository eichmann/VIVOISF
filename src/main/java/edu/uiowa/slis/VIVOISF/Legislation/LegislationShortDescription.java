package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationShortDescriptionIterator theLegislation = (LegislationShortDescriptionIterator)findAncestorWithClass(this, LegislationShortDescriptionIterator.class);
			pageContext.getOut().print(theLegislation.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

