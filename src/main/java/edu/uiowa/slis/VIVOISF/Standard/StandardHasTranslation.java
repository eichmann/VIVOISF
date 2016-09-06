package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardHasTranslationIterator theStandardHasTranslationIterator = (StandardHasTranslationIterator)findAncestorWithClass(this, StandardHasTranslationIterator.class);
			pageContext.getOut().print(theStandardHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

