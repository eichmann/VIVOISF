package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteHandleIterator theStatute = (StatuteHandleIterator)findAncestorWithClass(this, StatuteHandleIterator.class);
			pageContext.getOut().print(theStatute.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for handle tag ");
		}
		return SKIP_BODY;
	}
}

