package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteNumPagesIterator theStatute = (StatuteNumPagesIterator)findAncestorWithClass(this, StatuteNumPagesIterator.class);
			pageContext.getOut().print(theStatute.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for numPages tag ");
		}
		return SKIP_BODY;
	}
}

