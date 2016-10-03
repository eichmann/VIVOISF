package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteOwnerIterator theStatuteOwnerIterator = (StatuteOwnerIterator)findAncestorWithClass(this, StatuteOwnerIterator.class);
			pageContext.getOut().print(theStatuteOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for owner tag ");
		}
		return SKIP_BODY;
	}
}

