package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteStatusIterator theStatuteStatusIterator = (StatuteStatusIterator)findAncestorWithClass(this, StatuteStatusIterator.class);
			pageContext.getOut().print(theStatuteStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for status tag ");
		}
		return SKIP_BODY;
	}
}

