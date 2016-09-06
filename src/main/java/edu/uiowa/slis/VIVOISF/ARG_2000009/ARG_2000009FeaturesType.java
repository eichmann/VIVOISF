package edu.uiowa.slis.VIVOISF.ARG_2000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000009FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000009FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000009FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000009FeaturesIterator theARG_2000009FeaturesIterator = (ARG_2000009FeaturesIterator)findAncestorWithClass(this, ARG_2000009FeaturesIterator.class);
			pageContext.getOut().print(theARG_2000009FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000009 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000009 for features tag ");
		}
		return SKIP_BODY;
	}
}

