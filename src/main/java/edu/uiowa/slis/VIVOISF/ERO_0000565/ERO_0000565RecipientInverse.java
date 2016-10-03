package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565RecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565RecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565RecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565RecipientInverseIterator theERO_0000565RecipientInverseIterator = (ERO_0000565RecipientInverseIterator)findAncestorWithClass(this, ERO_0000565RecipientInverseIterator.class);
			pageContext.getOut().print(theERO_0000565RecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for recipient tag ");
		}
		return SKIP_BODY;
	}
}
