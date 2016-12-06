package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280RelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280RelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280RelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UO_0000280RelatesIterator theUO_0000280RelatesIterator = (UO_0000280RelatesIterator)findAncestorWithClass(this, UO_0000280RelatesIterator.class);
			pageContext.getOut().print(theUO_0000280RelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for relates tag ");
		}
		return SKIP_BODY;
	}
}

