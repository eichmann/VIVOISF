package edu.uiowa.slis.VIVOISF.ERO_0000392;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000392TranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000392TranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000392TranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000392TranslatorIterator theERO_0000392TranslatorIterator = (ERO_0000392TranslatorIterator)findAncestorWithClass(this, ERO_0000392TranslatorIterator.class);
			pageContext.getOut().print(theERO_0000392TranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000392 for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000392 for translator tag ");
		}
		return SKIP_BODY;
	}
}

