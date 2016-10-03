package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatutePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatutePages currentInstance = null;
	private static final Log log = LogFactory.getLog(StatutePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatutePagesIterator theStatute = (StatutePagesIterator)findAncestorWithClass(this, StatutePagesIterator.class);
			pageContext.getOut().print(theStatute.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for pages tag ");
		}
		return SKIP_BODY;
	}
}

