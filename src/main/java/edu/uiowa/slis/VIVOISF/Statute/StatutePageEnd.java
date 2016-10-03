package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatutePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatutePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(StatutePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatutePageEndIterator theStatute = (StatutePageEndIterator)findAncestorWithClass(this, StatutePageEndIterator.class);
			pageContext.getOut().print(theStatute.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

