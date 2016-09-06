package edu.uiowa.slis.VIVOISF.ERO_0000393;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000393FeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000393FeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000393FeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000393FeaturesIterator theERO_0000393FeaturesIterator = (ERO_0000393FeaturesIterator)findAncestorWithClass(this, ERO_0000393FeaturesIterator.class);
			pageContext.getOut().print(theERO_0000393FeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000393 for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000393 for features tag ");
		}
		return SKIP_BODY;
	}
}

