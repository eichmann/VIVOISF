package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(KindFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindFeaturesIterator theKindFeaturesIterator = (KindFeaturesIterator)findAncestorWithClass(this, KindFeaturesIterator.class);
			pageContext.getOut().print(theKindFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for features tag ");
		}
		return SKIP_BODY;
	}
}

