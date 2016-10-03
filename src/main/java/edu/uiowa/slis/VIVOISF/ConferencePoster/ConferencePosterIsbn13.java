package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIsbn13Iterator theConferencePoster = (ConferencePosterIsbn13Iterator)findAncestorWithClass(this, ConferencePosterIsbn13Iterator.class);
			pageContext.getOut().print(theConferencePoster.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

