package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeTranslatorOfIterator theCollegeTranslatorOfIterator = (CollegeTranslatorOfIterator)findAncestorWithClass(this, CollegeTranslatorOfIterator.class);
			pageContext.getOut().print(theCollegeTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

