package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHDINotesIterator thenon_self_governing = (non_self_governingHDINotesIterator)findAncestorWithClass(this, non_self_governingHDINotesIterator.class);
			pageContext.getOut().print(thenon_self_governing.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

