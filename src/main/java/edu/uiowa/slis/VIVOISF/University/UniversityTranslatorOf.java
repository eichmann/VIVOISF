package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversityTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversityTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversityTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversityTranslatorOfIterator theUniversityTranslatorOfIterator = (UniversityTranslatorOfIterator)findAncestorWithClass(this, UniversityTranslatorOfIterator.class);
			pageContext.getOut().print(theUniversityTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing University for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

