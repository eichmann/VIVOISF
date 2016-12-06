package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003HDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003HDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003HDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003HDINotesIterator theIAO_0000003 = (IAO_0000003HDINotesIterator)findAncestorWithClass(this, IAO_0000003HDINotesIterator.class);
			pageContext.getOut().print(theIAO_0000003.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

