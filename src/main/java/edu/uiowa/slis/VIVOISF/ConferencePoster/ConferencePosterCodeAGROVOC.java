package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeAGROVOCIterator theConferencePoster = (ConferencePosterCodeAGROVOCIterator)findAncestorWithClass(this, ConferencePosterCodeAGROVOCIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

