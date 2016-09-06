package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565TranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565TranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565TranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565TranslatorOfIterator theERO_0000565TranslatorOfIterator = (ERO_0000565TranslatorOfIterator)findAncestorWithClass(this, ERO_0000565TranslatorOfIterator.class);
			pageContext.getOut().print(theERO_0000565TranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

