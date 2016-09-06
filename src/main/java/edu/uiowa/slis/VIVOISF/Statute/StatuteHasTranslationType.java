package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StatuteHasTranslationIterator theStatuteHasTranslationIterator = (StatuteHasTranslationIterator)findAncestorWithClass(this, StatuteHasTranslationIterator.class);
			pageContext.getOut().print(theStatuteHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

