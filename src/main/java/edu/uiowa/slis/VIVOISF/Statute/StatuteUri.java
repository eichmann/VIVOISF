package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteUri currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteUriIterator theStatute = (StatuteUriIterator)findAncestorWithClass(this, StatuteUriIterator.class);
			pageContext.getOut().print(theStatute.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for uri tag ");
		}
		return SKIP_BODY;
	}
}

