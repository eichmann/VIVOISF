package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupFeaturesIterator theGroupFeaturesIterator = (GroupFeaturesIterator)findAncestorWithClass(this, GroupFeaturesIterator.class);
			pageContext.getOut().print(theGroupFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for features tag ");
		}
		return SKIP_BODY;
	}
}

