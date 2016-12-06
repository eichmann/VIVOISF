package edu.uiowa.slis.VIVOISF.IAO_0000009;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000009HasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000009HasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000009HasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IAO_0000009HasTelephoneIterator theIAO_0000009HasTelephoneIterator = (IAO_0000009HasTelephoneIterator)findAncestorWithClass(this, IAO_0000009HasTelephoneIterator.class);
			pageContext.getOut().print(theIAO_0000009HasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000009 for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000009 for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

