package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptTranslatorIterator theManuscriptTranslatorIterator = (ManuscriptTranslatorIterator)findAncestorWithClass(this, ManuscriptTranslatorIterator.class);
			pageContext.getOut().print(theManuscriptTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for translator tag ");
		}
		return SKIP_BODY;
	}
}

