package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeAGROVOCIterator theConferencePaper = (ConferencePaperCodeAGROVOCIterator)findAncestorWithClass(this, ConferencePaperCodeAGROVOCIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

