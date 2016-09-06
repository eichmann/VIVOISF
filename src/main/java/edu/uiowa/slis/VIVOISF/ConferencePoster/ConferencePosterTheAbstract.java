package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterTheAbstractIterator theConferencePoster = (ConferencePosterTheAbstractIterator)findAncestorWithClass(this, ConferencePosterTheAbstractIterator.class);
			pageContext.getOut().print(theConferencePoster.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

