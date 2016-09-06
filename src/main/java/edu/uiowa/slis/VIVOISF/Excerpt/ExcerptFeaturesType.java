package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptFeaturesIterator theExcerptFeaturesIterator = (ExcerptFeaturesIterator)findAncestorWithClass(this, ExcerptFeaturesIterator.class);
			pageContext.getOut().print(theExcerptFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for features tag ");
		}
		return SKIP_BODY;
	}
}

