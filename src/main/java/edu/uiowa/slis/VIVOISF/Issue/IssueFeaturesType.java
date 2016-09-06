package edu.uiowa.slis.VIVOISF.Issue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IssueFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IssueFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(IssueFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IssueFeaturesIterator theIssueFeaturesIterator = (IssueFeaturesIterator)findAncestorWithClass(this, IssueFeaturesIterator.class);
			pageContext.getOut().print(theIssueFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Issue for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Issue for features tag ");
		}
		return SKIP_BODY;
	}
}

