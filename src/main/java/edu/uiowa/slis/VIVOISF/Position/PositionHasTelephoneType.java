package edu.uiowa.slis.VIVOISF.Position;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PositionHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PositionHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(PositionHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PositionHasTelephoneIterator thePositionHasTelephoneIterator = (PositionHasTelephoneIterator)findAncestorWithClass(this, PositionHasTelephoneIterator.class);
			pageContext.getOut().print(thePositionHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Position for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing Position for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

