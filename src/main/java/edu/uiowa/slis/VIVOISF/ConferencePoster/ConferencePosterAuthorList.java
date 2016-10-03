package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAuthorListIterator theConferencePosterAuthorListIterator = (ConferencePosterAuthorListIterator)findAncestorWithClass(this, ConferencePosterAuthorListIterator.class);
			pageContext.getOut().print(theConferencePosterAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for authorList tag ");
		}
		return SKIP_BODY;
	}
}

