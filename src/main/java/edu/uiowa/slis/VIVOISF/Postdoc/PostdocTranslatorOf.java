package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocTranslatorOfIterator thePostdocTranslatorOfIterator = (PostdocTranslatorOfIterator)findAncestorWithClass(this, PostdocTranslatorOfIterator.class);
			pageContext.getOut().print(thePostdocTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

