package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPresentedAtIterator theConferencePosterPresentedAtIterator = (ConferencePosterPresentedAtIterator)findAncestorWithClass(this, ConferencePosterPresentedAtIterator.class);
			pageContext.getOut().print(theConferencePosterPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

