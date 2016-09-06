package edu.uiowa.slis.VIVOISF.ERO_0001256;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0001256TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0001256TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0001256TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0001256TranslatorIterator theERO_0001256TranslatorIterator = (ERO_0001256TranslatorIterator)findAncestorWithClass(this, ERO_0001256TranslatorIterator.class);
			pageContext.getOut().print(theERO_0001256TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0001256 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0001256 for translator tag ");
		}
		return SKIP_BODY;
	}
}

