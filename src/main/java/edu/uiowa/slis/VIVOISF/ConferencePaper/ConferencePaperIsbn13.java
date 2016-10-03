package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperIsbn13Iterator theConferencePaper = (ConferencePaperIsbn13Iterator)findAncestorWithClass(this, ConferencePaperIsbn13Iterator.class);
			pageContext.getOut().print(theConferencePaper.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

