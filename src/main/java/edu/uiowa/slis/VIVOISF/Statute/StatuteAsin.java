package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteAsinIterator theStatute = (StatuteAsinIterator)findAncestorWithClass(this, StatuteAsinIterator.class);
			pageContext.getOut().print(theStatute.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for asin tag ");
		}
		return SKIP_BODY;
	}
}

