package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasTitleIterator theConferencePosterHasTitleIterator = (ConferencePosterHasTitleIterator)findAncestorWithClass(this, ConferencePosterHasTitleIterator.class);
			pageContext.getOut().print(theConferencePosterHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

