package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteAuthorListIterator theStatuteAuthorListIterator = (StatuteAuthorListIterator)findAncestorWithClass(this, StatuteAuthorListIterator.class);
			pageContext.getOut().print(theStatuteAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for authorList tag ");
		}
		return SKIP_BODY;
	}
}

