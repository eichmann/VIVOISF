package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindFeaturesIterator theKindFeaturesIterator = (KindFeaturesIterator)findAncestorWithClass(this, KindFeaturesIterator.class);
			pageContext.getOut().print(theKindFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for features tag ");
		}
		return SKIP_BODY;
	}
}

