package edu.uiowa.slis.VIVOISF.ERO_0001261;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001261TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001261TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001261TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001261TranslatorIterator theERO_0001261TranslatorIterator = (ERO_0001261TranslatorIterator)findAncestorWithClass(this, ERO_0001261TranslatorIterator.class);
			pageContext.getOut().print(theERO_0001261TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001261 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001261 for translator tag ");
		}
		return SKIP_BODY;
	}
}

