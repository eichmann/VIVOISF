package edu.uiowa.slis.VIVOISF.PrimaryPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrimaryPositionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrimaryPositionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(PrimaryPositionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrimaryPositionHasTelephoneIterator thePrimaryPositionHasTelephoneIterator = (PrimaryPositionHasTelephoneIterator)findAncestorWithClass(this, PrimaryPositionHasTelephoneIterator.class);
			pageContext.getOut().print(thePrimaryPositionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing PrimaryPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrimaryPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

