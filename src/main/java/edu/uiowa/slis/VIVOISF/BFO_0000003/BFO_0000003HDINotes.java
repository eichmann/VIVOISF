package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003HDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003HDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003HDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003HDINotesIterator theBFO_0000003 = (BFO_0000003HDINotesIterator)findAncestorWithClass(this, BFO_0000003HDINotesIterator.class);
			pageContext.getOut().print(theBFO_0000003.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

