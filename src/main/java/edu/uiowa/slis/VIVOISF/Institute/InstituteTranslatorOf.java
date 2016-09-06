package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteTranslatorOfIterator theInstituteTranslatorOfIterator = (InstituteTranslatorOfIterator)findAncestorWithClass(this, InstituteTranslatorOfIterator.class);
			pageContext.getOut().print(theInstituteTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

