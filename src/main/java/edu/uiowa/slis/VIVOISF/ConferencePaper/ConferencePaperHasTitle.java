package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasTitleIterator theConferencePaperHasTitleIterator = (ConferencePaperHasTitleIterator)findAncestorWithClass(this, ConferencePaperHasTitleIterator.class);
			pageContext.getOut().print(theConferencePaperHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

