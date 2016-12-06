package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionHasTelephoneIterator thePostdocPositionHasTelephoneIterator = (PostdocPositionHasTelephoneIterator)findAncestorWithClass(this, PostdocPositionHasTelephoneIterator.class);
			pageContext.getOut().print(thePostdocPositionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

