package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceHasTranslationIterator theReferenceSourceHasTranslationIterator = (ReferenceSourceHasTranslationIterator)findAncestorWithClass(this, ReferenceSourceHasTranslationIterator.class);
			pageContext.getOut().print(theReferenceSourceHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

