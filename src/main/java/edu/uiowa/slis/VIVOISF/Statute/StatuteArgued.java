package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteArguedIterator theStatute = (StatuteArguedIterator)findAncestorWithClass(this, StatuteArguedIterator.class);
			pageContext.getOut().print(theStatute.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for argued tag ");
		}
		return SKIP_BODY;
	}
}

