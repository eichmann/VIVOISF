package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterSectionIterator theConferencePoster = (ConferencePosterSectionIterator)findAncestorWithClass(this, ConferencePosterSectionIterator.class);
			pageContext.getOut().print(theConferencePoster.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for section tag ");
		}
		return SKIP_BODY;
	}
}

