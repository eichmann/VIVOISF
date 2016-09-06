package edu.uiowa.slis.VIVOISF.SynonymType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymTypeTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymTypeTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymTypeTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SynonymTypeTranslatorIterator theSynonymTypeTranslatorIterator = (SynonymTypeTranslatorIterator)findAncestorWithClass(this, SynonymTypeTranslatorIterator.class);
			pageContext.getOut().print(theSynonymTypeTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing SynonymType for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing SynonymType for translator tag ");
		}
		return SKIP_BODY;
	}
}

