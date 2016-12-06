package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryGDPUnitIterator theterritory = (territoryGDPUnitIterator)findAncestorWithClass(this, territoryGDPUnitIterator.class);
			pageContext.getOut().print(theterritory.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

