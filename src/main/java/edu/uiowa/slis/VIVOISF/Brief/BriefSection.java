package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefSection currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefSectionIterator theBrief = (BriefSectionIterator)findAncestorWithClass(this, BriefSectionIterator.class);
			pageContext.getOut().print(theBrief.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for section tag ");
		}
		return SKIP_BODY;
	}
}

