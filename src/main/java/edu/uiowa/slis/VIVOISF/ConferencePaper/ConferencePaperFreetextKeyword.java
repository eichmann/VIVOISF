package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperFreetextKeywordIterator theConferencePaper = (ConferencePaperFreetextKeywordIterator)findAncestorWithClass(this, ConferencePaperFreetextKeywordIterator.class);
			pageContext.getOut().print(theConferencePaper.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

