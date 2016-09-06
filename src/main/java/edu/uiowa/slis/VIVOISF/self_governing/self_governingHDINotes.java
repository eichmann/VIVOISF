package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHDINotesIterator theself_governing = (self_governingHDINotesIterator)findAncestorWithClass(this, self_governingHDINotesIterator.class);
			pageContext.getOut().print(theself_governing.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

