package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasTranslationIterator theConferencePosterHasTranslationIterator = (ConferencePosterHasTranslationIterator)findAncestorWithClass(this, ConferencePosterHasTranslationIterator.class);
			pageContext.getOut().print(theConferencePosterHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

