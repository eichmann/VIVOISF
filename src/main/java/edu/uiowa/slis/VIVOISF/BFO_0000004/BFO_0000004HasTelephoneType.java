package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004HasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004HasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004HasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004HasTelephoneIterator theBFO_0000004HasTelephoneIterator = (BFO_0000004HasTelephoneIterator)findAncestorWithClass(this, BFO_0000004HasTelephoneIterator.class);
			pageContext.getOut().print(theBFO_0000004HasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

