package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003TranslatorIterator theIAO_0000003TranslatorIterator = (IAO_0000003TranslatorIterator)findAncestorWithClass(this, IAO_0000003TranslatorIterator.class);
			pageContext.getOut().print(theIAO_0000003TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for translator tag ");
		}
		return SKIP_BODY;
	}
}

