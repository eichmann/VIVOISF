package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatutePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatutePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(StatutePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatutePageStartIterator theStatute = (StatutePageStartIterator)findAncestorWithClass(this, StatutePageStartIterator.class);
			pageContext.getOut().print(theStatute.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

