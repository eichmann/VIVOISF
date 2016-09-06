package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperTranslatorIterator theNewspaperTranslatorIterator = (NewspaperTranslatorIterator)findAncestorWithClass(this, NewspaperTranslatorIterator.class);
			pageContext.getOut().print(theNewspaperTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for translator tag ");
		}
		return SKIP_BODY;
	}
}

