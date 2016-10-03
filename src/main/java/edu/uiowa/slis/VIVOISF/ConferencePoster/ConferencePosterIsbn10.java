package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterIsbn10Iterator theConferencePoster = (ConferencePosterIsbn10Iterator)findAncestorWithClass(this, ConferencePosterIsbn10Iterator.class);
			pageContext.getOut().print(theConferencePoster.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

