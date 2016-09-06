package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013HasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013HasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013HasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013HasTranslationIterator theIAO_0000013HasTranslationIterator = (IAO_0000013HasTranslationIterator)findAncestorWithClass(this, IAO_0000013HasTranslationIterator.class);
			pageContext.getOut().print(theIAO_0000013HasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

