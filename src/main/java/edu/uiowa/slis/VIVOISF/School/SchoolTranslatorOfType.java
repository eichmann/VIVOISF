package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolTranslatorOfIterator theSchoolTranslatorOfIterator = (SchoolTranslatorOfIterator)findAncestorWithClass(this, SchoolTranslatorOfIterator.class);
			pageContext.getOut().print(theSchoolTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

