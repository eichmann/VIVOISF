package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteAuthorListIterator theStatuteAuthorListIterator = (StatuteAuthorListIterator)findAncestorWithClass(this, StatuteAuthorListIterator.class);
			pageContext.getOut().print(theStatuteAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for authorList tag ");
		}
		return SKIP_BODY;
	}
}

