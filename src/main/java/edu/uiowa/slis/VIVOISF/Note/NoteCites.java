package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteCites currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteCitesIterator theNoteCitesIterator = (NoteCitesIterator)findAncestorWithClass(this, NoteCitesIterator.class);
			pageContext.getOut().print(theNoteCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for cites tag ");
		}
		return SKIP_BODY;
	}
}

