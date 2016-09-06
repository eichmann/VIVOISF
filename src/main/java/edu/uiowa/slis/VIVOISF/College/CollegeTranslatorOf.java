package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeTranslatorOfIterator theCollegeTranslatorOfIterator = (CollegeTranslatorOfIterator)findAncestorWithClass(this, CollegeTranslatorOfIterator.class);
			pageContext.getOut().print(theCollegeTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing College for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

