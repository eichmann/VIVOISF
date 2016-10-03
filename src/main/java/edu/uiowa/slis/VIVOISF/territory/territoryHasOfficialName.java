package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHasOfficialName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHasOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHasOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHasOfficialNameIterator theterritory = (territoryHasOfficialNameIterator)findAncestorWithClass(this, territoryHasOfficialNameIterator.class);
			pageContext.getOut().print(theterritory.getHasOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for hasOfficialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for hasOfficialName tag ");
		}
		return SKIP_BODY;
	}
}

