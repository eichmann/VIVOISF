package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperFeaturesIterator theNewspaperFeaturesIterator = (NewspaperFeaturesIterator)findAncestorWithClass(this, NewspaperFeaturesIterator.class);
			pageContext.getOut().print(theNewspaperFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for features tag ");
		}
		return SKIP_BODY;
	}
}

