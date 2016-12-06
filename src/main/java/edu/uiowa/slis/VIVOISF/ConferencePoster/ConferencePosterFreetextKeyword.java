package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterFreetextKeywordIterator theConferencePoster = (ConferencePosterFreetextKeywordIterator)findAncestorWithClass(this, ConferencePosterFreetextKeywordIterator.class);
			pageContext.getOut().print(theConferencePoster.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

