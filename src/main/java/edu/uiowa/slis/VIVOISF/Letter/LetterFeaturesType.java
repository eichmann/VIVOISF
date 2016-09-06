package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterFeaturesIterator theLetterFeaturesIterator = (LetterFeaturesIterator)findAncestorWithClass(this, LetterFeaturesIterator.class);
			pageContext.getOut().print(theLetterFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for features tag ");
		}
		return SKIP_BODY;
	}
}

