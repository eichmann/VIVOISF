package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryHasTelephoneIterator theterritoryHasTelephoneIterator = (territoryHasTelephoneIterator)findAncestorWithClass(this, territoryHasTelephoneIterator.class);
			pageContext.getOut().print(theterritoryHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

