package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterAuthorListIterator theConferencePosterAuthorListIterator = (ConferencePosterAuthorListIterator)findAncestorWithClass(this, ConferencePosterAuthorListIterator.class);
			pageContext.getOut().print(theConferencePosterAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for authorList tag ");
		}
		return SKIP_BODY;
	}
}

