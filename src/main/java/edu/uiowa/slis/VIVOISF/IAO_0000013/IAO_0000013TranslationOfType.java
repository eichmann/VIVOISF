package edu.uiowa.slis.VIVOISF.IAO_0000013;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000013TranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000013TranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000013TranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000013TranslationOfIterator theIAO_0000013TranslationOfIterator = (IAO_0000013TranslationOfIterator)findAncestorWithClass(this, IAO_0000013TranslationOfIterator.class);
			pageContext.getOut().print(theIAO_0000013TranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000013 for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000013 for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

