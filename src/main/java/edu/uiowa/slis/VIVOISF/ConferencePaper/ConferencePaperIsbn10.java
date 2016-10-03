package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperIsbn10Iterator theConferencePaper = (ConferencePaperIsbn10Iterator)findAncestorWithClass(this, ConferencePaperIsbn10Iterator.class);
			pageContext.getOut().print(theConferencePaper.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

