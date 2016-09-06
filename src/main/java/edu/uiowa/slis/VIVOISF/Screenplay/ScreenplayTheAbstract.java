package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayTheAbstractIterator theScreenplay = (ScreenplayTheAbstractIterator)findAncestorWithClass(this, ScreenplayTheAbstractIterator.class);
			pageContext.getOut().print(theScreenplay.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

