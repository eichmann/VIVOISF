package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindHDINotesIterator theKind = (KindHDINotesIterator)findAncestorWithClass(this, KindHDINotesIterator.class);
			pageContext.getOut().print(theKind.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

