package edu.uiowa.slis.VIVOISF.ERO_0000394;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000394TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000394TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000394TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000394TranslatorIterator theERO_0000394TranslatorIterator = (ERO_0000394TranslatorIterator)findAncestorWithClass(this, ERO_0000394TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000394TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000394 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000394 for translator tag ");
		}
		return SKIP_BODY;
	}
}

