package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteNumberIterator theStatute = (StatuteNumberIterator)findAncestorWithClass(this, StatuteNumberIterator.class);
			pageContext.getOut().print(theStatute.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for number tag ");
		}
		return SKIP_BODY;
	}
}

