package edu.uiowa.slis.VIVOISF.Manuscript;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManuscriptFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManuscriptFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ManuscriptFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ManuscriptFeaturesIterator theManuscriptFeaturesIterator = (ManuscriptFeaturesIterator)findAncestorWithClass(this, ManuscriptFeaturesIterator.class);
			pageContext.getOut().print(theManuscriptFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Manuscript for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manuscript for features tag ");
		}
		return SKIP_BODY;
	}
}

