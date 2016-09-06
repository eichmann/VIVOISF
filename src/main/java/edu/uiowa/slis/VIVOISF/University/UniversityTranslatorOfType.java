package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityTranslatorOfIterator theUniversityTranslatorOfIterator = (UniversityTranslatorOfIterator)findAncestorWithClass(this, UniversityTranslatorOfIterator.class);
			pageContext.getOut().print(theUniversityTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing University for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

