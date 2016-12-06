package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryTelephone.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryTelephoneIterator theterritory = (territoryTelephoneIterator)findAncestorWithClass(this, territoryTelephoneIterator.class);
			pageContext.getOut().print(theterritory.getTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for telephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for telephone tag ");
		}
		return SKIP_BODY;
	}
}

