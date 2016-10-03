package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationSection currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationSectionIterator theLegislation = (LegislationSectionIterator)findAncestorWithClass(this, LegislationSectionIterator.class);
			pageContext.getOut().print(theLegislation.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for section tag ");
		}
		return SKIP_BODY;
	}
}

