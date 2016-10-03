package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteShortTitleIterator theStatute = (StatuteShortTitleIterator)findAncestorWithClass(this, StatuteShortTitleIterator.class);
			pageContext.getOut().print(theStatute.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

