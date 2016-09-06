package edu.uiowa.slis.VIVOISF.ERO_0000391;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000391TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000391TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000391TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000391TranslatorIterator theERO_0000391TranslatorIterator = (ERO_0000391TranslatorIterator)findAncestorWithClass(this, ERO_0000391TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000391TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000391 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000391 for translator tag ");
		}
		return SKIP_BODY;
	}
}

